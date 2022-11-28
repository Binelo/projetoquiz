(function(){
$("#tabusuarios").on("click",".js-delete", function(){
    let botaoClicado  = $(this);
    $("#btnsim").attr("data-id",botaoClicado.attr("data-id"));
    $("#modalusuario").modal("show");
});

$("#btnsim").on("click",function(){
    let botaoSim = $(this);
    let id = botaoSim.attr("data-id");
    $.ajax({
        url: "/usuarios/delete/" + id,
        method: "GET",
        success: function(){
            window.location.href="/usuarios";
        }
    });
});
})();

(function(){
$("#tabpergunta").on("click",".js-delete", function(){
    let botaoClicado  = $(this);
    $("#btnsim").attr("data-id",botaoClicado.attr("data-id"));
    $("#modalpergunta").modal("show");
});

$("#btnsim").on("click",function(){
    let botaoSim = $(this);
    let id = botaoSim.attr("data-id");
    $.ajax({
        url: "/pergunta/delete/" + id,
        method: "GET",
        success: function(){
            window.location.href="/pergunta";
        }
    });
});
})();
