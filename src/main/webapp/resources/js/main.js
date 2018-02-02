$(window).on('scroll', function() {
    if($(window).scrollTop()) {
        $('nav').addClass('black');
    } else {
        $('nav').removeClass('black');
    }
});

$('.home').on('click', function() {
    $(window).scrollTop = 0;
});