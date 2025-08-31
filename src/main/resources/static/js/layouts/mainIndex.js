$(document).ready(function() {
    // 시계 업데이트
    function setTime() {
        var now = new Date();
        $("#time").text(now.toLocaleString());
    }

    setInterval(setTime, 1000); // 1초마다 갱신
    setTime();                   // 페이지 로딩 시 바로 표시
});