package com.yjs.cloud.learning.learn.biz.homework.bean;

import com.yjs.cloud.learning.learn.biz.homework.entity.HomeworkRecord;
import com.yjs.cloud.learning.learn.biz.homework.enums.HomeworkRecordStatus;
import com.yjs.cloud.learning.learn.common.util.BeanCopierUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 作业记录
 *
 * @author Bill.lai
 * @since 2021/4/28
 */
@ApiModel
@Data
public class HomeworkRecordCreateRequest {

    @ApiModelProperty(value = "课程Id")
    private Long lessonId;

    @ApiModelProperty(value = "会员Id", hidden = true)
    private Long memberId;

    @ApiModelProperty(value = "提交内容路径")
    private String url;

    @ApiModelProperty(value = "报名id")
    private Long signUpId;

    @ApiModelProperty(value = "状态")
    private HomeworkRecordStatus status = HomeworkRecordStatus.waiting_approval;

    public HomeworkRecord convert() {
        HomeworkRecord response = new HomeworkRecord();
        BeanCopierUtils.copy(this, response);
        return response;
    }

}
