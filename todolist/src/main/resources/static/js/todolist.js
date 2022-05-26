/**
 * 
 */

 const addContent = document.querySelector(".add-content");
 const studyList = document.querySelector(".study-list");
 
addContent.onclick = () => {
	let url = "/api/v1/todo";
	
	let option = {
		method = "POST",
		headers = {
			"Content-Type" : "application/json"
		},
		body: JSON.stringify({
			content: addContent.value
		})
	};
	
	fetch(url, option)
	.then(response => {
		if(response.ok){
			return response.json();
		}else{
			throw new Error("처리 오류")
		}
	})
	.then(result => console.log(result))
	.catch(error => console.log(error));
}	
	
	
