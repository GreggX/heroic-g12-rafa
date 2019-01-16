let url = document.getElementById('url');

function requestHttp () {
  let urlVal = url.value;

  var xhr = new XMLHttpRequest();

  xhr.open('GET', urlVal);

  xhr.onload = (e) => {
    if (xhr.readyState === 4) {
      if (xhr.status === 200) {
        let data = JSON.parse(xhr.responseText);
        console.log(data);
      } else {
        console.log('Code error');
      }
    }
  }

  xhr.onerror = (e) => {
    console.log('Error fetch');
  }

  xhr.send();
}