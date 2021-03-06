package com.yjs.cloud.learning.learn.biz.api.favorite.bean;

import com.yjs.cloud.learning.learn.biz.api.favorite.enums.FavoriteTopicType;
import com.yjs.cloud.learning.learn.common.request.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 请求参数
 *
 * @author Bill.lai
 * @since 2020/8/20
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel
@Data
public class FavoriteGetPageListRequest extends PageRequest {

    @ApiModelProperty(value = "主题id")
    private List<Long> topicIdList;

    @ApiModelProperty(value = "主题类型", example = "lesson")
    private FavoriteTopicType topicType;

    @ApiModelProperty(value = "用户ID", hidden = true)
    private Long memberId;

}
