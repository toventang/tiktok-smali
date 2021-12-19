package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ProviderEffect extends ProviderEffectTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect;

    static {
        Covode.recordClassIndex(95415);
    }

    public ProviderEffect() {
        this(null, 1, null);
    }

    public static final class StickerBean extends ProviderEffectTemplate.StickerBeanTemplate implements Serializable {
        private final transient ProviderEffect.StickerBean kStickerBean;

        static {
            Covode.recordClassIndex(95416);
        }

        public StickerBean() {
            this(null, 1, null);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate.StickerBeanTemplate
        public final ProviderEffect.StickerBean getKStickerBean() {
            return this.kStickerBean;
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public final String getHeight() {
            String height;
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 == null || (height = kStickerBean2.getHeight()) == null) {
                return super.getHeight();
            }
            return height;
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public final String getSize() {
            String size;
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 == null || (size = kStickerBean2.getSize()) == null) {
                return super.getSize();
            }
            return size;
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public final String getUrl() {
            String url;
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 == null || (url = kStickerBean2.getUrl()) == null) {
                return super.getUrl();
            }
            return url;
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public final String getWidth() {
            String width;
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 == null || (width = kStickerBean2.getWidth()) == null) {
                return super.getWidth();
            }
            return width;
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public final void setHeight(String str) {
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 != null) {
                kStickerBean2.setHeight(str);
            }
            super.setHeight(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public final void setSize(String str) {
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 != null) {
                kStickerBean2.setSize(str);
            }
            super.setSize(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public final void setUrl(String str) {
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 != null) {
                kStickerBean2.setUrl(str);
            }
            super.setUrl(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public final void setWidth(String str) {
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 != null) {
                kStickerBean2.setWidth(str);
            }
            super.setWidth(str);
        }

        public StickerBean(ProviderEffect.StickerBean stickerBean) {
            super(stickerBean);
            this.kStickerBean = stickerBean;
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 != null) {
                String height = kStickerBean2.getHeight();
                if (height != null) {
                    super.setHeight(height);
                }
                String size = kStickerBean2.getSize();
                if (size != null) {
                    super.setSize(size);
                }
                String url = kStickerBean2.getUrl();
                if (url != null) {
                    super.setUrl(url);
                }
                String width = kStickerBean2.getWidth();
                if (width != null) {
                    super.setWidth(width);
                }
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StickerBean(ProviderEffect.StickerBean stickerBean, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : stickerBean);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public final com.ss.ugc.effectplatform.model.ProviderEffect getKProviderEffect() {
        return this.kProviderEffect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public final String getClickUrl() {
        return super.getClickUrl();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public final StickerBean getSticker() {
        return super.getSticker();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public final StickerBean getThumbnailSticker() {
        return super.getThumbnailSticker();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final String getClick_url() {
        String click_url;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (click_url = kProviderEffect2.getClick_url()) == null) {
            return super.getClick_url();
        }
        return click_url;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (extra = kProviderEffect2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final String getId() {
        String id;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (id = kProviderEffect2.getId()) == null) {
            return super.getId();
        }
        return id;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final String getPath() {
        String path;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (path = kProviderEffect2.getPath()) == null) {
            return super.getPath();
        }
        return path;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final ProviderEffect.StickerBean getThumbnail_sticker() {
        ProviderEffect.StickerBean thumbnail_sticker;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (thumbnail_sticker = kProviderEffect2.getThumbnail_sticker()) == null) {
            return super.getThumbnail_sticker();
        }
        return thumbnail_sticker;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final String getTitle() {
        String title;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (title = kProviderEffect2.getTitle()) == null) {
            return super.getTitle();
        }
        return title;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final String getUser_name() {
        String user_name;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (user_name = kProviderEffect2.getUser_name()) == null) {
            return super.getUser_name();
        }
        return user_name;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public final void setClickUrl(String str) {
        super.setClickUrl(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public final void setSticker(StickerBean stickerBean) {
        super.setSticker(stickerBean);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public final void setThumbnailSticker(StickerBean stickerBean) {
        super.setThumbnailSticker(stickerBean);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final void setClick_url(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setClick_url(str);
        }
        super.setClick_url(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final void setExtra(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final void setPath(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setPath(str);
        }
        super.setPath(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final void setThumbnail_sticker(ProviderEffect.StickerBean stickerBean) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setThumbnail_sticker(stickerBean);
        }
        super.setThumbnail_sticker(stickerBean);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final void setTitle(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setTitle(str);
        }
        super.setTitle(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final void setUser_name(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setUser_name(str);
        }
        super.setUser_name(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public final void setId(String str) {
        l.c(str, "");
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setId(str);
        }
        super.setId(str);
    }

    public ProviderEffect(com.ss.ugc.effectplatform.model.ProviderEffect providerEffect) {
        super(providerEffect);
        this.kProviderEffect = providerEffect;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            String click_url = kProviderEffect2.getClick_url();
            if (click_url != null) {
                super.setClick_url(click_url);
            }
            String extra = kProviderEffect2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            String id = kProviderEffect2.getId();
            if (id != null) {
                super.setId(id);
            }
            String path = kProviderEffect2.getPath();
            if (path != null) {
                super.setPath(path);
            }
            ProviderEffect.StickerBean sticker_info = kProviderEffect2.getSticker_info();
            if (sticker_info != null) {
                super.setSticker_info(sticker_info);
            }
            ProviderEffect.StickerBean thumbnail_sticker = kProviderEffect2.getThumbnail_sticker();
            if (thumbnail_sticker != null) {
                super.setThumbnail_sticker(thumbnail_sticker);
            }
            String title = kProviderEffect2.getTitle();
            if (title != null) {
                super.setTitle(title);
            }
            String user_name = kProviderEffect2.getUser_name();
            if (user_name != null) {
                super.setUser_name(user_name);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffect(com.ss.ugc.effectplatform.model.ProviderEffect providerEffect, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : providerEffect);
    }
}
