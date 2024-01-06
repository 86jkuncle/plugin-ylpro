import { definePlugin } from "@halo-dev/console-shared";
import YlProView from "./views/YlProView.vue";
import { markRaw } from "vue";
import TablerBrandProducthunt from '~icons/tabler/brand-producthunt';

export default definePlugin({
  components: {},
  routes: [
    {
      parentName: "Root",
      route: {
        path: "/ylpro",
        name: "ylpro",
        component: YlProView,
        meta: {
          title: "产品",
          searchable: true,
          menu: {
            name: "产品",
            group: "content",
            icon: markRaw(TablerBrandProducthunt),
            priority: 0,
          },
        },
      },
    },
  ],
  extensionPoints: {},
});
