package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume;

import android.text.TextUtils;
import b.g;
import com.bytedance.covode.number.Covode;
import com.google.gson.t;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.log.ae;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.i;
import com.ss.android.ugc.aweme.sticker.j;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.video.aa;
import com.ss.android.ugc.playerkit.videoview.h;
import h.f.b.l;
import h.m.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class a {
    public static final String q = "information";
    public static final String r = "com.android.information";
    public static final String s = "com.apple.quicktime.information";
    public static final String t = "com.bytedance.info";
    public static final String u = "interaction_stickers";
    public static final C3397a v = new C3397a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Aweme f130288a;

    /* renamed from: b  reason: collision with root package name */
    public DataCenter f130289b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.k.a f130290c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.k.d f130291d;

    /* renamed from: e  reason: collision with root package name */
    public i f130292e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.video.i f130293f;

    /* renamed from: g  reason: collision with root package name */
    public h f130294g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.k.c f130295h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f130296i = true;

    /* renamed from: j  reason: collision with root package name */
    public InteractStickerViewModel f130297j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f130298k;

    /* renamed from: l  reason: collision with root package name */
    public int f130299l;

    /* renamed from: m  reason: collision with root package name */
    public String f130300m = "";
    public com.ss.android.ugc.aweme.sticker.k.b n;
    public AbsInteractStickerWidget o;
    public final b p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$a  reason: collision with other inner class name */
    public static final class C3397a {
        static {
            Covode.recordClassIndex(85456);
        }

        private C3397a() {
        }

        public /* synthetic */ C3397a(byte b2) {
            this();
        }
    }

    public static final class d extends com.google.gson.b.a<ArrayList<InteractStickerStruct>> {
        static {
            Covode.recordClassIndex(85459);
        }

        d() {
        }
    }

    public final void c() {
        InteractStickerViewModel interactStickerViewModel;
        AbsInteractStickerWidget aA_ = this.p.aA_();
        this.o = aA_;
        if (aA_ != null) {
            aA_.a(this.f130288a);
        }
        AbsInteractStickerWidget absInteractStickerWidget = this.o;
        if (absInteractStickerWidget != null) {
            interactStickerViewModel = absInteractStickerWidget.e();
        } else {
            interactStickerViewModel = null;
        }
        this.f130297j = interactStickerViewModel;
        a();
    }

    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130301a;

        static {
            Covode.recordClassIndex(85457);
        }

        public b(a aVar) {
            this.f130301a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            a aVar = this.f130301a;
            ArrayList<InteractStickerStruct> b2 = aVar.b();
            if (!com.bytedance.common.utility.collection.b.a((Collection) b2)) {
                ArrayList arrayList = new ArrayList();
                if (b2 != null) {
                    for (T t : b2) {
                        if (t != null) {
                            str = t.getAttr();
                        } else {
                            str = null;
                        }
                        l.b(str, "");
                        if (!aVar.a(str)) {
                            arrayList.add(t);
                        }
                    }
                    b2.removeAll(arrayList);
                }
            }
            return b2;
        }
    }

    static {
        Covode.recordClassIndex(85455);
    }

    public final void a() {
        String str;
        String str2;
        long j2;
        VideoReplyStruct videoReplyStruct;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        j jVar = new j();
        jVar.o = this.f130290c;
        jVar.n = this.f130291d;
        jVar.p = this.f130295h;
        jVar.q = this.n;
        jVar.r = this.f130292e;
        jVar.f134922c = c.b(this.f130288a);
        jVar.f134923d = c.a(this.f130288a);
        jVar.f134932m = this.f130296i;
        jVar.f134924e = this.f130298k;
        Aweme aweme = this.f130288a;
        String str3 = null;
        if (aweme == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd3.getLogExtra();
        }
        jVar.f134927h = str;
        Aweme aweme2 = this.f130288a;
        if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null) {
            str2 = null;
        } else {
            str2 = awemeRawAd2.getPageFrom();
        }
        jVar.f134928i = str2;
        Aweme aweme3 = this.f130288a;
        if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
            j2 = 0;
        } else {
            j2 = creativeId.longValue();
        }
        jVar.f134929j = j2;
        Aweme aweme4 = this.f130288a;
        if (aweme4 == null) {
            l.b();
        }
        jVar.f134930k = ae.a(aweme4);
        Aweme aweme5 = this.f130288a;
        if (aweme5 != null) {
            videoReplyStruct = aweme5.getVideoReplyStruct();
        } else {
            videoReplyStruct = null;
        }
        jVar.s = videoReplyStruct;
        jVar.t = b(this.f130288a);
        Aweme aweme6 = this.f130288a;
        if (aweme6 != null) {
            str3 = aweme6.getRequestId();
        }
        jVar.f134931l = str3;
        jVar.f134926g = this.f130300m;
        l.b(jVar, "");
        jVar.f134925f = this.f130299l;
        if (this.o != null) {
            DataCenter dataCenter = this.f130289b;
            if (dataCenter != null) {
                dataCenter.a("interact_sticker_data", jVar);
                return;
            }
            InteractStickerViewModel interactStickerViewModel = this.f130297j;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.a("interact_sticker_data", jVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final ArrayList<InteractStickerStruct> b() {
        String str;
        String str2;
        com.ss.android.ugc.aweme.video.i iVar = this.f130293f;
        ArrayList<InteractStickerStruct> arrayList = null;
        if (iVar != null) {
            str = iVar.b(q);
            if (str == null) {
                com.ss.android.ugc.aweme.video.i iVar2 = this.f130293f;
                if (iVar2 == null) {
                    l.b();
                }
                str = iVar2.b(r);
            }
            if (str == null) {
                com.ss.android.ugc.aweme.video.i iVar3 = this.f130293f;
                if (iVar3 == null) {
                    l.b();
                }
                str = iVar3.b(s);
            }
        } else {
            h hVar = this.f130294g;
            if (hVar != null) {
                str = aa.a(hVar, q);
                if (str == null) {
                    str = aa.a(this.f130294g, r);
                }
                if (str == null) {
                    str = aa.a(this.f130294g, s);
                }
            } else {
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            str2 = new JSONObject(new JSONObject(str).getString(t)).getString(u);
        } catch (Exception e2) {
            e2.printStackTrace();
            str2 = null;
        }
        try {
            arrayList = (ArrayList) GsonHolder.c().b().a(str2, new d().type);
            return arrayList;
        } catch (t e3) {
            e3.printStackTrace();
            return arrayList;
        }
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.p = bVar;
    }

    public final void a(Aweme aweme) {
        this.f130288a = aweme;
        AbsInteractStickerWidget absInteractStickerWidget = this.o;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.a(aweme);
        }
    }

    public final void a(ArrayList<InteractStickerStruct> arrayList) {
        DataCenter dataCenter = this.f130289b;
        if (dataCenter != null) {
            dataCenter.a("interact_sticker_aweme_data", arrayList);
            return;
        }
        InteractStickerViewModel interactStickerViewModel = this.f130297j;
        if (interactStickerViewModel != null) {
            interactStickerViewModel.a("interact_sticker_aweme_data", arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(ArrayList<InteractStickerStruct> arrayList) {
        DataCenter dataCenter = this.f130289b;
        if (dataCenter != null) {
            dataCenter.a("interact_sticker_video_data", arrayList);
            return;
        }
        InteractStickerViewModel interactStickerViewModel = this.f130297j;
        if (interactStickerViewModel != null) {
            interactStickerViewModel.a("interact_sticker_video_data", arrayList);
        }
    }

    public static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130303a;

        static {
            Covode.recordClassIndex(85458);
        }

        public c(a aVar) {
            this.f130303a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            a aVar = this.f130303a;
            l.b(iVar, "");
            ArrayList<InteractStickerStruct> arrayList = (ArrayList) iVar.d();
            if (aVar.o != null) {
                aVar.b(arrayList);
            } else if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList)) {
                aVar.c();
                aVar.b(arrayList);
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ ClassCastException -> 0x0044 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            java.lang.String r4 = ""
            if (r5 != 0) goto L_0x0005
            return r4
        L_0x0005:
            java.util.List r0 = r5.getTextExtra()
            boolean r0 = com.bytedance.common.utility.collection.b.a(r0)
            if (r0 == 0) goto L_0x0010
            return r4
        L_0x0010:
            java.util.List r0 = r5.getTextExtra()     // Catch:{ ClassCastException -> 0x0044 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ ClassCastException -> 0x0044 }
        L_0x0018:
            boolean r0 = r3.hasNext()     // Catch:{ ClassCastException -> 0x0044 }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r2 = r3.next()     // Catch:{ ClassCastException -> 0x0044 }
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r2     // Catch:{ ClassCastException -> 0x0044 }
            h.f.b.l.b(r2, r4)     // Catch:{ ClassCastException -> 0x0044 }
            int r1 = r2.getSubtype()     // Catch:{ ClassCastException -> 0x0044 }
            r0 = 2
            if (r1 == r0) goto L_0x0035
            int r1 = r2.getSubtype()     // Catch:{ ClassCastException -> 0x0044 }
            r0 = 3
            if (r1 != r0) goto L_0x0018
        L_0x0035:
            java.lang.String r0 = r2.getUserId()     // Catch:{ ClassCastException -> 0x0044 }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r2.getUserId()     // Catch:{ ClassCastException -> 0x0044 }
            h.f.b.l.b(r0, r4)     // Catch:{ ClassCastException -> 0x0044 }
            r4 = r0
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0048:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public final boolean a(String str) {
        BusinessExtraData businessExtraData;
        String stickerIDs;
        l.d(str, "");
        List list = null;
        try {
            businessExtraData = (BusinessExtraData) GsonHolder.c().b().a(new JSONObject(str).getString("interaction_extra"), BusinessExtraData.class);
        } catch (Exception e2) {
            e2.printStackTrace();
            businessExtraData = null;
        }
        if (businessExtraData == null) {
            return false;
        }
        Aweme aweme = this.f130288a;
        if (!(aweme == null || (stickerIDs = aweme.getStickerIDs()) == null)) {
            list = p.c(stickerIDs, new String[]{","});
        }
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return false;
        }
        if (list == null) {
            l.b();
        }
        return list.contains(businessExtraData.getStickerId());
    }

    public static final class e<T> implements Comparator {
        static {
            Covode.recordClassIndex(85460);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.getIndex()), Integer.valueOf(t2.getIndex()));
        }
    }

    public final void a(int i2, int i3) {
        DataCenter dataCenter = this.f130289b;
        if (dataCenter != null) {
            dataCenter.a("interact_sticker_update_intro_layout_y", v.a(Integer.valueOf(i2), Integer.valueOf(i3)));
            return;
        }
        InteractStickerViewModel interactStickerViewModel = this.f130297j;
        if (interactStickerViewModel != null) {
            interactStickerViewModel.a("interact_sticker_update_intro_layout_y", v.a(Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }
}
