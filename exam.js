---
layout: null
---




$(document).ready(function(){
    console.log("exam.js: document is ready");

    $('.template').each(function(i) {
	$(this).css('display','none');
    });

    // Use with  <div class="copy-of" data-id="foo"></div>
    // Use   <div id="foo" class="template"></div> on the stuff you want to copy
    // The class="template" will hide it the first time.
    // The  class="copy-of" data-id="foo" signals that you want a copy of foo inserted here.
    
    $('.copy-of').each(function(i) {
	var id = $(this).data('id')
	$(this).html($(document.getElementById(id)).clone().html());
    });

    
    $('.page-break-before').each(function(i) {
	var pageNum = i+1;
	
	var prev = $(this).prev();
	var evenOddClass = (pageNum % 2 == 0)?
	    "even-page" : "odd-page";
	$(this).addClass(evenOddClass);
	var $div = $("<div>", {class: "pagebreak " + evenOddClass});
	prev.append($div);
	$('.exam-page-header-template').first().clone().appendTo($div);
	if (pageNum %2 ==0) {
	    var img = $('<img>');
	    img.addClass("even-page-staple-img");
            img.attr('src', "/images/Staple-Even-Pages.png");
	    img.appendTo($div);
	} else {
	 $('.exam-name-header-template').first().clone().appendTo($div); 
	}
	prev.css('margin-bottom','0');
    });


    $('td.page-num').each(function(i) {
	var pageNum = i + 1
	$(this).html(pageNum); // re-calculate page numbers
	$(this).data("pageNum",pageNum);
	if (pageNum % 2==0) {
	    $(this).parents(".pagebreak").removeClass("odd-page");
	    $(this).parents(".pagebreak").addClass("even-page");
	} else {
	    $(this).parents(".pagebreak").removeClass("even-page");
	    $(this).parents(".pagebreak").addClass("odd-page");
	}
    });

    console.log("exam.js: done");
});
