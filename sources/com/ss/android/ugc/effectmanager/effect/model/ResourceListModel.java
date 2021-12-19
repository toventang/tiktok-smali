package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class ResourceListModel extends ResourceListModelTemplate implements Parcelable, Serializable {
    public static final Parcelable.Creator<ResourceListModel> CREATOR = new ResourceListModel$Companion$CREATOR$1();
    public static final Companion Companion = new Companion(null);
    private final transient com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel;

    public static final class ResourceListBean extends ResourceListModelTemplate.ResourceListBeanTemplate implements Parcelable, Serializable {
        public static final Parcelable.Creator<ResourceListBean> CREATOR = new ResourceListModel$ResourceListBean$Companion$CREATOR$1();
        public static final Companion Companion = new Companion(null);
        private final transient ResourceListModel.ResourceListBean kResourceBean;

        public ResourceListBean() {
            this(null, 1, null);
        }

        public static final class Companion {
            static {
                Covode.recordClassIndex(95422);
            }

            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.ResourceListBeanTemplate
        public final ResourceListModel.ResourceListBean getKResourceBean() {
            return this.kResourceBean;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.ResourceListBeanTemplate
        public final String getResourceUrl() {
            return super.getResourceUrl();
        }

        static {
            Covode.recordClassIndex(95421);
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public final String getName() {
            String name;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 == null || (name = kResourceBean2.getName()) == null) {
                return super.getName();
            }
            return name;
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public final String getResource_uri() {
            String resource_uri;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 == null || (resource_uri = kResourceBean2.getResource_uri()) == null) {
                return super.getResource_uri();
            }
            return resource_uri;
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public final String getValue() {
            String value;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 == null || (value = kResourceBean2.getValue()) == null) {
                return super.getValue();
            }
            return value;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.ResourceListBeanTemplate
        public final void setResourceUrl(String str) {
            super.setResourceUrl(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public final void setName(String str) {
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 != null) {
                kResourceBean2.setName(str);
            }
            super.setName(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public final void setResource_uri(String str) {
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 != null) {
                kResourceBean2.setResource_uri(str);
            }
            super.setResource_uri(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public final void setValue(String str) {
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 != null) {
                kResourceBean2.setValue(str);
            }
            super.setValue(str);
        }

        public ResourceListBean(ResourceListModel.ResourceListBean resourceListBean) {
            super(resourceListBean);
            this.kResourceBean = resourceListBean;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 != null) {
                String name = kResourceBean2.getName();
                if (name != null) {
                    super.setName(name);
                }
                String resource_uri = kResourceBean2.getResource_uri();
                if (resource_uri != null) {
                    super.setResource_uri(resource_uri);
                }
                String value = kResourceBean2.getValue();
                if (value != null) {
                    super.setValue(value);
                }
            }
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public final void writeToParcel(Parcel parcel, int i2) {
            l.c(parcel, "");
            if (getKResourceBean() != null) {
                ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
                if (kResourceBean2 != null) {
                    kResourceBean2.writeToParcel(parcel, i2);
                    return;
                }
                return;
            }
            super.writeToParcel(parcel, i2);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResourceListBean(ResourceListModel.ResourceListBean resourceListBean, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : resourceListBean);
        }
    }

    public ResourceListModel() {
        this(null, 1, null);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(95419);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public final com.ss.ugc.effectplatform.model.ResourceListModel getKResourceModel() {
        return this.kResourceModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public final String getIconUri() {
        return super.getIconUri();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public final String getParam() {
        return super.getParam();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public final List<ResourceListBean> getResourceList() {
        return super.getResourceList();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public final List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    static {
        Covode.recordClassIndex(95418);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public final String getIcon_uri() {
        String icon_uri;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (icon_uri = kResourceModel2.getIcon_uri()) == null) {
            return super.getIcon_uri();
        }
        return icon_uri;
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public final String getParams() {
        String params;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (params = kResourceModel2.getParams()) == null) {
            return super.getParams();
        }
        return params;
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public final List<ResourceListModel.ResourceListBean> getResource_list() {
        List<ResourceListModel.ResourceListBean> resource_list;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (resource_list = kResourceModel2.getResource_list()) == null) {
            return super.getResource_list();
        }
        return resource_list;
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public final List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (url_prefix = kResourceModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public final void setIconUri(String str) {
        super.setIconUri(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public final void setParam(String str) {
        super.setParam(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public final void setIcon_uri(String str) {
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setIcon_uri(str);
        }
        super.setIcon_uri(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public final void setParams(String str) {
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setParams(str);
        }
        super.setParams(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public final void setResourceList(List<ResourceListBean> list) {
        l.c(list, "");
        super.setResourceList(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public final void setUrlPrefix(List<String> list) {
        l.c(list, "");
        super.setUrlPrefix(list);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public final void setResource_list(List<? extends ResourceListModel.ResourceListBean> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setResource_list(list);
        }
        super.setResource_list(list);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public final void setUrl_prefix(List<String> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public ResourceListModel(com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel) {
        super(resourceListModel);
        this.kResourceModel = resourceListModel;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            String icon_uri = kResourceModel2.getIcon_uri();
            if (icon_uri != null) {
                super.setIcon_uri(icon_uri);
            }
            String params = kResourceModel2.getParams();
            if (params != null) {
                super.setParams(params);
            }
            List<ResourceListModel.ResourceListBean> resource_list = kResourceModel2.getResource_list();
            if (resource_list != null) {
                super.setResource_list(resource_list);
            }
            List<String> url_prefix = kResourceModel2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public final void writeToParcel(Parcel parcel, int i2) {
        l.c(parcel, "");
        if (getKResourceModel() != null) {
            com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
            if (kResourceModel2 != null) {
                kResourceModel2.writeToParcel(parcel, i2);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceListModel(com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : resourceListModel);
    }
}
