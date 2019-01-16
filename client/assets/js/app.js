let url = document.getElementById('url');

function requestHttp () {
	let urlVal = url.value;

	var xhr = new XMLHttpRequest();
	// xhr.withCredentials = true;

	xhr.open('GET', urlVal);
	xhr.setRequestHeader('Content-Type', 'application/json');
	xhr.setRequestHeader('cache-control', 'no-cache');

	xhr.onload = (e) => {
		if (xhr.readyState === 4) {
			if (xhr.status === 200) {
				console.log('Some');
			} else {
				console.log('Error');
			}
		}
	}

	xhr.onerror = (e) => {
		console.log('Error');
	}

	xhr.send();
}