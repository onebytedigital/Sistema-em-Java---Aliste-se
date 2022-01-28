$(function() {
    AOS.init()
    sidebar()
    modal()
})

function animarLogo() {
    $(".nav-brand").onclick(function () {
    })
}

function sidebar() {
    $("#toggle").click(function() {
        $(".sidebar").toggleClass("active")
        $(".logo-sidebar").toggleClass("active")
        $(".nav-title").toggleClass("active")
    })
}

function modal() {
    $(".open-novo").click(function() {
        modal1 = $(".novo-usuario")
       modal1.fadeIn()
       modal1.css("display","flex")
    })

    $(".btn-close").click(function() {
        modal1.fadeOut()
    })
}

function editar() {
    $(".editar-usuario").fadeIn()
}

function menu() {
    $(window).scroll(function() {
        var scroll = $(window).scrollTop();

        if (scroll >= 50) {
            $("header").addClass("fixed")
            $(".nav-link").addClass("fixed")
            $(".nav-icon").addClass("fixed")
        }else {
            $("header").removeClass("fixed")
            $(".nav-link").removeClass("fixed")
            $(".nav-icon").removeClass("fixed")
        }
    }); //missing );
}

function chart1() {
    const labels = [
        'Janeiro',
        'Fevereiro',
        'Março',
        'Abril',
        'Maio',
        'Junho',
      ]

    const data = {
        labels: labels,
        datasets: [{
            label: 'Receitas',
            backgroundColor: 'transparent',
            borderColor: '#009675',
            data: [5.000,00, 3.000,00, 7.500, 6.000,00, 4.000,00, 8.000,00, 12.000,00],
          }]
      };
    const config = {
        type: 'line',
        data,
        options: {
        }
      }     

      var chart1 = new Chart(
        document.getElementById('chart1'),
        config
      );
}

function chart2() {
    const labels = [
        'Janeiro',
        'Fevereiro',
        'Março',
        'Abril',
        'Maio',
        'Junho',
      ]

    const data = {
        labels: labels,
        datasets: [{
            label: 'Receitas',
            backgroundColor: 'transparent',
            borderColor: 'red',
            data: [5.000,00, 3.000,00, 7.500, 6.000,00, 4.000,00, 8.000,00, 12.000,00],
          }]
      };
    const config = {
        type: 'line',
        data,
        options: {
        }
      }     

      var chart1 = new Chart(
        document.getElementById('chart2'),
        config
      );
}