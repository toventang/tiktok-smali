package com.ss.android.ugc.aweme.commercialize.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Arrays;
import java.util.Map;

public final class c {
    static {
        Covode.recordClassIndex(45360);
    }

    public static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ WikipediaInfo $info$inlined;
        final /* synthetic */ Map $mobParams$inlined;
        final /* synthetic */ Map $params$inlined;
        final /* synthetic */ WikipediaInfo $this_apply;

        static {
            Covode.recordClassIndex(45361);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(WikipediaInfo wikipediaInfo, Map map, WikipediaInfo wikipediaInfo2, Context context, Map map2) {
            super(0);
            this.$this_apply = wikipediaInfo;
            this.$params$inlined = map;
            this.$info$inlined = wikipediaInfo2;
            this.$context$inlined = context;
            this.$mobParams$inlined = map2;
        }

        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            String str = "";
            l.b(iESSettingsProxy, str);
            String wikipediaAnchorUrlPlaceholder = iESSettingsProxy.getWikipediaAnchorUrlPlaceholder();
            l.b(wikipediaAnchorUrlPlaceholder, str);
            String a2 = com.a.a(wikipediaAnchorUrlPlaceholder, Arrays.copyOf(new Object[]{this.$this_apply.getLang(), this.$this_apply.getKeyword()}, 2));
            l.b(a2, str);
            Map map = this.$params$inlined;
            String keyword = this.$this_apply.getKeyword();
            if (keyword == null) {
                l.b();
            }
            map.put("title", keyword);
            Map map2 = this.$params$inlined;
            String keyword2 = this.$this_apply.getKeyword();
            if (keyword2 == null) {
                l.b();
            }
            map2.put("wiki_entry", keyword2);
            Map map3 = this.$params$inlined;
            String lang = this.$this_apply.getLang();
            if (lang == null) {
                l.b();
            }
            map3.put("language", lang);
            Map map4 = this.$params$inlined;
            String anchorId = this.$info$inlined.getAnchorId();
            if (anchorId != null) {
                str = anchorId;
            }
            map4.put("anchor_id", str);
            AddWikiActivity.a.a(this.$context$inlined, a2, this.$params$inlined, this.$mobParams$inlined);
            return z.f158842a;
        }
    }

    public static final class b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ h.f.a.a $jump;

        static {
            Covode.recordClassIndex(45362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.f.a.a aVar) {
            super(1);
            this.$jump = aVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.c(R.string.hf9, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.commercialize.b.c.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(45363);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.$jump.invoke();
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            return z.f158842a;
        }
    }

    public static final void a(Context context, WikipediaInfo wikipediaInfo, Map<String, String> map, Map<String, String> map2) {
        String keyword;
        Integer status;
        String str;
        l.d(context, "");
        l.d(wikipediaInfo, "");
        l.d(map, "");
        l.d(map2, "");
        String lang = wikipediaInfo.getLang();
        if (lang != null && lang.length() != 0 && (keyword = wikipediaInfo.getKeyword()) != null && keyword.length() != 0) {
            a aVar = new a(wikipediaInfo, map, wikipediaInfo, context, map2);
            WikipediaExtra extra = wikipediaInfo.getExtra();
            if (extra == null || (status = extra.getStatus()) == null || status.intValue() == 0) {
                aVar.invoke();
                return;
            }
            com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(context);
            WikipediaExtra extra2 = wikipediaInfo.getExtra();
            String str2 = null;
            if (extra2 != null) {
                str = extra2.getWarningMsg();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str2 = context.getString(R.string.hfa);
            } else {
                WikipediaExtra extra3 = wikipediaInfo.getExtra();
                if (extra3 != null) {
                    str2 = extra3.getWarningMsg();
                }
            }
            com.bytedance.tux.dialog.b.c.a(bVar.d(str2), new b(aVar)).a().b().show();
        }
    }
}
