package com.ss.android.ugc.aweme.shortvideo.util;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.api.IGetVideoInfoApi;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.k.j;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f132374a = new w();

    private w() {
    }

    static {
        Covode.recordClassIndex(86678);
    }

    public static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f132375a = new a();

        static {
            Covode.recordClassIndex(86679);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_play_circle;
            return z.f158842a;
        }
    }

    static final class b<T> implements ag {

        /* renamed from: a  reason: collision with root package name */
        public static final b f132376a = new b();

        static {
            Covode.recordClassIndex(86680);
        }

        b() {
        }

        @Override // f.a.ag
        public final void a_(ae<? super com.ss.android.ugc.aweme.publish.api.b> aeVar) {
            l.d(aeVar, "");
            aeVar.onSuccess(new com.ss.android.ugc.aweme.publish.api.b());
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f132381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f132382b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MentionEditText f132383c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f132384d;

        static {
            Covode.recordClassIndex(86682);
        }

        d(int i2, int i3, MentionEditText mentionEditText, String str) {
            this.f132381a = i2;
            this.f132382b = i3;
            this.f132383c = mentionEditText;
            this.f132384d = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            w.a(this.f132381a, this.f132382b, this.f132383c);
            MentionEditText mentionEditText = this.f132383c;
            if (mentionEditText != null) {
                mentionEditText.a("timeout", false, this.f132381a, null, this.f132384d);
            }
        }
    }

    public static int a(List<? extends AVTextExtraStruct> list) {
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == 5) {
                i2++;
            }
        }
        return i2;
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f132377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f132378b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MentionEditText f132379c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f132380d;

        static {
            Covode.recordClassIndex(86681);
        }

        c(int i2, int i3, MentionEditText mentionEditText, String str) {
            this.f132377a = i2;
            this.f132378b = i3;
            this.f132379c = mentionEditText;
            this.f132380d = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.publish.api.b bVar = (com.ss.android.ugc.aweme.publish.api.b) obj;
            w.a(this.f132377a, this.f132378b, this.f132379c);
            if (bVar.f118613a == 408) {
                MentionEditText mentionEditText = this.f132379c;
                if (mentionEditText != null) {
                    mentionEditText.a("timeout", false, this.f132377a, null, this.f132380d);
                    return;
                }
                return;
            }
            String str = null;
            if (bVar.f118613a != 0 || bVar.f118615c == null || bVar.f118614b == null) {
                MentionEditText mentionEditText2 = this.f132379c;
                if (mentionEditText2 != null) {
                    com.ss.android.ugc.aweme.publish.api.a aVar = bVar.f118615c;
                    if (aVar != null) {
                        str = aVar.f118611b;
                    }
                    mentionEditText2.a(str, false, this.f132377a, null, this.f132380d);
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.publish.api.a aVar2 = bVar.f118615c;
            if (aVar2 == null) {
                l.b();
            }
            if (aVar2.f118610a) {
                MentionEditText mentionEditText3 = this.f132379c;
                if (mentionEditText3 != null) {
                    mentionEditText3.a(bVar.f118615c.f118611b, bVar.f118615c.f118612c, this.f132377a, bVar.f118614b, this.f132380d);
                    return;
                }
                return;
            }
            MentionEditText mentionEditText4 = this.f132379c;
            if (mentionEditText4 != null) {
                com.ss.android.ugc.aweme.publish.api.a aVar3 = bVar.f118615c;
                if (aVar3 != null) {
                    str = aVar3.f118611b;
                }
                mentionEditText4.a(str, false, this.f132377a, null, this.f132380d);
            }
        }
    }

    public static final boolean a(String str) {
        if (str == null || str.length() == 0 || str.length() < 23 || str.length() > j.a() || !p.b(str, "https://", false) || !p.a((CharSequence) str, (CharSequence) "tiktok", false)) {
            return false;
        }
        return true;
    }

    public static void a(int i2, int i3, MentionEditText mentionEditText) {
        if (mentionEditText != null && mentionEditText.s) {
            mentionEditText.setHasUrlTransforming(false);
            Editable text = mentionEditText.getText();
            if (text != null) {
                text.delete(i2, i3);
            }
            mentionEditText.setUrlEnd(i2);
        }
    }

    public static void a(VideoPublishEditModel videoPublishEditModel, String str, int i2, int i3) {
        String str2;
        l.d(videoPublishEditModel, "");
        l.d(str, "");
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel.creationId).a("enter_from", "video_post_page").a("shoot_way", videoPublishEditModel.mShootWay).a("content_source", es.a(videoPublishEditModel)).a("content_type", es.c(videoPublishEditModel)).a("enter_method", str).a("author_is_private", i3);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 140) {
                    if (i2 != 143) {
                        str2 = "public";
                        r.a("add_quote_video_finish", a2.a("privacy_status", str2).f149193a);
                    }
                }
            }
            str2 = "friendVisible";
            r.a("add_quote_video_finish", a2.a("privacy_status", str2).f149193a);
        }
        str2 = "private";
        r.a("add_quote_video_finish", a2.a("privacy_status", str2).f149193a);
    }

    public static void a(String str, int i2, int i3, MentionEditText mentionEditText) {
        l.d(str, "");
        l.d(str, "");
        ab<com.ss.android.ugc.aweme.publish.api.b> videoInfoByURL = ((IGetVideoInfoApi) g.a().C().createRetrofit(g.a().C().getApiHost(), true, IGetVideoInfoApi.class)).getVideoInfoByURL(str);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b bVar = b.f132376a;
        f.a.e.b.b.a((Object) bVar, "other is null");
        videoInfoByURL.a(10, timeUnit, f.a.h.a.a(f.a.k.a.f158005b), bVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(i2, i3, mentionEditText, str), new d(i2, i3, mentionEditText, str));
    }
}
