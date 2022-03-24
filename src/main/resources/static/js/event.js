window.onload = function() {

    if(document.getElementById("writeNotice")) {
        const $writeNotice = document.getElementById("writeNotice");
        $writeNotice.onclick = function() {
            location.href = "/spring/notice/regist";
        }
    }
}