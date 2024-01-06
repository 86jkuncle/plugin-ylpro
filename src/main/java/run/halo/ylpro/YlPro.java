package run.halo.ylpro;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import run.halo.app.extension.AbstractExtension;
import run.halo.app.extension.GVK;

/**
* @Description java类的作用
* @Author mtxst
* @Date 2024/1/7 1:28 $
 * /apis/{}group}/{version}/plural
 * /apis/{}group}/{version}/plural/{name}
*/
@Data
@EqualsAndHashCode(callSuper = true)
@GVK(group = "ylpro.halo.run",kind = "YlPro", version = "v1alpha1",plural = "ylpros" , singular = "ylpro")
public class YlPro extends AbstractExtension {

    private YlProSpec spec;

    @Data
    public static class YlProSpec {
        //顶部图片
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
        private String topImage;

        //顶部描述
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
        private String topTitle;

        private Integer priority;


        private String groupName;
    }
}
