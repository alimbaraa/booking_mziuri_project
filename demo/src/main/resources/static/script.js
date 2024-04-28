async function bookRoom(){
    var hotelID = 0;
    var roomID = document.getElementById("room-select").value;
     url = "/room/reserve?hotelId=" + hotelID + "&roomId=" + roomID;

    // url = "/room/reserve?hotelId=0&roomId=1"

    var response = await fetch(url, {
        method: "PUT",
        mode: 'cors'
    });

    var res = JSON.stringify(response); 

    console.log("response: " + res);
    alert("Room has been reserved");

    closePopup();
}

async function cancelReservation(){
    var hotelID = 0;
    var roomID = 1;
    url = "http://localhost:8080/room/cancel?hotelId=" + hotelID + "&roomId=" + roomID;

    var response = await fetch(url, {
        method: "PUT",
        mode: 'cors'
    });

    console.log("response: " + response);
}

function addHotel(){

}

function getAllRooms(){

}

function openPopup(){
    let popup = document.getElementById("popup");
    popup.classList.add("open-popup");

    var div = document.getElementById("chatRooms");
    div.style.visibility = "hidden";
}

function closePopup(){
    let popup = document.getElementById("popup");
    popup.classList.remove("open-popup");
    var text = document.getElementById("chatName");
    text.value = "";

    var div = document.getElementById("chatRooms");
    div.style.visibility = "visible";
}