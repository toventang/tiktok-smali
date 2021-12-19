package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.multi.c;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final class t extends o {
    static {
        Covode.recordClassIndex(71240);
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final c i() {
        return new t();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.YELP.getTYPE();
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ SmartImageView $imageView;

        static {
            Covode.recordClassIndex(71241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SmartImageView smartImageView) {
            super(0);
            this.$imageView = smartImageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$imageView.setImageResource(2131232166);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void a(SmartImageView smartImageView) {
        l.d(smartImageView, "");
        a(smartImageView, new a(smartImageView));
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        l.d(dVar, "");
        a(new b(this, dVar));
        o.a(this, dVar, false, false, 6);
    }

    static final class b extends m implements h.f.a.b<AnchorCommonStruct, z> {
        final /* synthetic */ d $eventMapBuilder;
        final /* synthetic */ t this$0;

        static {
            Covode.recordClassIndex(71242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(t tVar, d dVar) {
            super(1);
            this.this$0 = tVar;
            this.$eventMapBuilder = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            l.d(anchorCommonStruct2, "");
            String schema = anchorCommonStruct2.getSchema();
            String keyword = anchorCommonStruct2.getKeyword();
            if (!TextUtils.isEmpty(schema) && !TextUtils.isEmpty(keyword)) {
                HashMap hashMap = new HashMap();
                if (keyword == null) {
                    l.b();
                }
                hashMap.put("title", keyword);
                String authorUid = this.this$0.o().getAuthorUid();
                if (authorUid == null) {
                    authorUid = "";
                }
                hashMap.put("author_id", authorUid);
                String aid = this.this$0.o().getAid();
                l.b(aid, "");
                hashMap.put("group_id", aid);
                hashMap.put("enter_from", this.this$0.p());
                hashMap.put("anchor_entry", keyword);
                hashMap.put("anchor_type", "Yelp");
                hashMap.put("anchor_id", anchorCommonStruct2.getId());
                Activity r = this.this$0.r();
                if (schema == null) {
                    l.b();
                }
                Map<String, String> map = this.$eventMapBuilder.f66730a;
                l.b(map, "");
                AddWikiActivity.a.a(r, schema, hashMap, map);
            }
            return z.f158842a;
        }
    }
}
