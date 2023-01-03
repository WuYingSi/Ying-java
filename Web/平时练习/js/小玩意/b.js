$(function () {
    var imgs = $('a>img');
    imgs.each(function () {
        var img = $(this);
        var width = img.attr('width');//区域宽度
        var height = img.attr('height');//区域高度
        var showWidth = width;//最终显示宽度
        var showHeight = height;//最终显示高度
        var ratio = width / height;//宽高比
        img.load(function () {
            var imgWidth, imgHeight, imgratio;
            $('<img />').attr('src', img.attr('src')).load(function () {
                imgWidth = this.width;//图片实际宽度
                imgHeight = this.height;//图片实际高度
                imgRatio = imgWidth / imgHeight;//实际宽高比
                if (ratio > imgRatio) {
                    showWidth = height * imgRatio;//调整宽度太小
                    img.attr('width', showWidth).css('margin-left', (width - showWidth) / 2);
                } else {
                    showHeight = width / imgRatio;//调高度太小
                    img.attr('height', showHeight).css('margin-top', (height - showHeight) / 2);
                }
            });
        });
    });
});