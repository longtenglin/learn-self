$.ajaxSetup({
    timeout: 600000,
    cache: false,
    async: true,
    // error: function (xhr, status, e) {
    //     if (xhr.getResponseHeader("sessionstatus") === "timeOut") {
    //         window.location.replace(ctx + "login?redirect="+(xhr.getResponseHeader("redirect")===null
    //             ?encodeURIComponent(getCurrentRoute(SESSION_CURRENT_ROUTER))
    //             :xhr.getResponseHeader("redirect")));
    //     } else if(xhr.status === 401){
    //         $('.div-alert').error("タイムアウトまたは操作権限がありません!");
    //     }else{
    //         $('.div-alert').error("問題が起きました。システム管理者へ連絡してください。");
    //     }
    // }
});


const ajax = (object) => {
    let def = {
        url: "http:localhost:8080",
        request_data: {},
        request_type: "POST",
        request_dataType: "json",
        content_type: "application/json;charset=utf-8",
        cache: false,
        async: true,
    };
    let ops = $.extend({}, def, object);
    return $.ajax({
        type: ops.request_type,
        data: ops.request_data,
        dataType: ops.request_dataType,
        url: ops.url,
        contentType: ops.content_type,
        cache: ops.cache,
        timeout: ops.timeout,
        async: ops.async,
        beforeSend: function () {
        },
    }).fail(function (xhr, status, e) {
    })
};


const Ajax = (object) => {
    return ajax(object)
        .done(function (response,status,xhr) {
            if( response.statusCode === "SZN0000"){
                return response
            }else{
                alert(response.statusCode +"  "+ response.message)
            }
        })
};
