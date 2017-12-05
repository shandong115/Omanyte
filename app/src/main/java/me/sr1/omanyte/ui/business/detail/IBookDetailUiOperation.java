package me.sr1.omanyte.ui.business.detail;

import com.roalab.devkit.ui.UiOperation;

import me.sr1.omanyte.enity.BookDetail;

/**
 * 书籍详情页面Ui操作
 * @author SR1
 */

public interface IBookDetailUiOperation extends UiOperation {

    public void updateDetail(BookDetail detail);
}
