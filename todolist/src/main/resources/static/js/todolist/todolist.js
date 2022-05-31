const addBtn = document.querySelector(".btn-add-content");

main();

async function main() {
    load();
}

function load() {
    request("/api/v1/todo/list")
        .then(result => {
            loadList(result.data);
        })
        .catch(error => {
            console.log(error);
        });
}

function loadList(contentList) {
    const ulContentList = document.querySelector(".ul-content-list");

    let liStr = ``;
    for (let content of contentList) {
		console.log(content);
        liStr += `
            <li class="l-content-list">
                <input type="checkbox" value=${content.complet}>
                <div class="content-item">
                    <span class=" text-content">
                        ${content.content}
                    </span>
                    <button class="btn-content bc-modifi">
                        <i class="fa-solid fa-pen"></i>
                    </button>
                    <button class="btn-content bc-delete">
                        <i class="fa-solid fa-trash"></i>
                    </button>
                </div>
                <div class="content-modifi-item item-invisible">
                    <input type="text" class="input-content" value="${content.content}">
                    <button class="btn-content bc-submit">
                        <i class="fa-solid fa-check"></i>
                    </button>
                    <button class="btn-content bc-cancle">
                        <i class="fa-solid fa-xmark"></i>
                    </button>
                </div>
            </li>
        `;
    }
    ulContentList.innerHTML = liStr;

}

async function request(url) {
    const response = await fetch(url);
    if (response.ok) {
        return response.json();
    } else {
        throw new Error("error: " + response);
    }
}

async function request(url, option) {
    const response = await fetch(url, option);
    if (response.ok) {
        return response.json();
    } else {
        throw new Error("error: " + response);
    }
}



addBtn.onclick = () => {
	const url = "/api/v1/todo";
	const option = {
		method: "POST",
		headers: {
			"Content-Type":"application/json"
		},
		body: JSON.stringify(
			{
				"usercode": 1,
				"content": document.querySelector(".ip-add-content").value,
				"complet": 0
			}
		)
	}
	request(url, option)
	.then(result => {
		load();
		document.querySelector(".ip-add-content").value = "";
	})
	.catch(error => {
		console.log(error);
	})
}








