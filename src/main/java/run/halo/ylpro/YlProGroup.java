package run.halo.ylpro;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.LinkedHashSet;
import lombok.Data;
import lombok.EqualsAndHashCode;
import run.halo.app.extension.AbstractExtension;
import run.halo.app.extension.GVK;

/**
* @Description java类的作用
* @Author mtxst
* @Date 2024/1/7 1:59 $
*/
@Data
@EqualsAndHashCode(callSuper = true)
@GVK(group = "ylpro.halo.run",kind = "YlProGroup", version = "v1alpha1",plural = "ylprogroups" , singular = "ylprogroup")
public class YlProGroup extends AbstractExtension {

    private YlProGroupSpec spec;
    @Data
    public static class YlProGroupSpec {
        //名称
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
        private String displayName;

        //排序
        private Integer priority;

        @ArraySchema(arraySchema = @Schema(description = "links of this group"),schema = @Schema(description = "name of links"))
        private LinkedHashSet<String> links;
    }

}
