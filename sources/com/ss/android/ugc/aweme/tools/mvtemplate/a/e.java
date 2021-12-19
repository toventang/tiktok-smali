package com.ss.android.ugc.aweme.tools.mvtemplate.a;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.property.co;
import com.ss.android.ugc.aweme.property.cx;
import com.ss.android.ugc.aweme.property.cy;
import com.ss.android.ugc.aweme.property.dh;
import com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dm;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.p;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import org.json.JSONObject;

public final class e {

    /* renamed from: k  reason: collision with root package name */
    public static final a f140744k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public MvThemeData f140745a;

    /* renamed from: b  reason: collision with root package name */
    public AVETParameter f140746b;

    /* renamed from: c  reason: collision with root package name */
    public MusicModel f140747c;

    /* renamed from: d  reason: collision with root package name */
    public String f140748d;

    /* renamed from: e  reason: collision with root package name */
    public ShortVideoContext f140749e;

    /* renamed from: f  reason: collision with root package name */
    public b f140750f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f140751g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.tools.mvtemplate.a.a.e.b f140752h = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.e.b();

    /* renamed from: i  reason: collision with root package name */
    public final d f140753i = new d();

    /* renamed from: j  reason: collision with root package name */
    public final androidx.fragment.app.e f140754j;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a f140755l;

    /* renamed from: m  reason: collision with root package name */
    private AVChallenge f140756m;
    private long n;
    private final Map<String, String> o = new LinkedHashMap();
    private FaceStickerBean p;
    private List<? extends MediaModel> q;
    private final boolean r;

    public interface b {
        static {
            Covode.recordClassIndex(91909);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(91907);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91908);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class g implements com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f140764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.d f140765b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ShortVideoContext f140766c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ IPhotoPreDownloadMusic f140767d = null;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f140768e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z.e f140769f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f140770g;

        static {
            Covode.recordClassIndex(91916);
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.d
        public final void a() {
            e.a(1, this.f140764a.f140753i, this.f140768e.size());
            b bVar = this.f140770g;
            if (bVar != null) {
                bVar.a(false);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v56, resolved type: java.util.ArrayList<java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.d
        public final void a(MvThemeData mvThemeData, MusicModel musicModel, String str, boolean z, boolean z2) {
            boolean z3;
            boolean z4;
            int i2;
            int i3;
            ad adVar;
            HashMap hashMap;
            Integer num;
            l.d(mvThemeData, "");
            this.f140764a.f140747c = musicModel;
            this.f140764a.f140748d = str;
            this.f140764a.f140751g = z;
            boolean a2 = i.a(str);
            int i4 = 0;
            if (this.f140765b.f140659a != 0 && ((musicModel != null && musicModel.getId() == Long.MIN_VALUE) || !a2)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (musicModel != null && str != null && !z3 && ((adVar = this.f140766c.A) == null || (hashMap = adVar.mExtraShareOptions) == null || (num = (Integer) hashMap.get("tiktok_videokit_disable_music_selection")) == null || num.intValue() != 1)) {
                if (!z2 && (this.f140764a.f140754j instanceof w)) {
                    ((w) this.f140764a.f140754j).a(true, musicModel, str);
                }
                IPhotoPreDownloadMusic iPhotoPreDownloadMusic = this.f140767d;
                if (iPhotoPreDownloadMusic != null) {
                    iPhotoPreDownloadMusic.firstMusicDownloadSuccess(musicModel, str);
                }
                if (this.f140766c.f124757b.f124713h == null) {
                    this.f140766c.a(com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.a());
                }
                this.f140766c.f124757b.f124713h.a(str);
                this.f140766c.a(str);
                this.f140766c.P = !z;
                int duration = musicModel.getDuration();
                if (duration > 0) {
                    this.f140766c.f124764i = duration;
                }
                this.f140766c.d(0);
                AVExternalServiceImpl.a().publishService().setCurMusic(musicModel, false, Boolean.valueOf(!z));
            }
            String d2 = mvThemeData.d();
            com.ss.android.ugc.aweme.mvtheme.d dVar = new com.ss.android.ugc.aweme.mvtheme.d();
            for (Object obj : this.f140768e) {
                dVar.selectMediaList.add(obj);
            }
            dVar.isMVRes1080p = cy.a.a().f118429a;
            this.f140764a.f140745a = mvThemeData;
            this.f140764a.f140746b = this.f140766c.j();
            if (!k.a(dVar.selectMediaList) && !TextUtils.isEmpty(d2)) {
                e eVar = this.f140764a;
                if (SettingsManager.a().a("enable_1080p_photo_mv", false) || cy.a.a().f118429a) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z.c cVar = new z.c();
                if (z4) {
                    i2 = 1080;
                } else {
                    i2 = 720;
                }
                cVar.element = i2;
                z.c cVar2 = new z.c();
                if (z4) {
                    i3 = 1920;
                } else {
                    i3 = 1280;
                }
                cVar2.element = i3;
                z.c cVar3 = new z.c();
                cVar3.element = 1;
                MvThemeData mvThemeData2 = eVar.f140745a;
                if (mvThemeData2 != null) {
                    if (!(mvThemeData2.f140624g == 0 || mvThemeData2.f140625h == 0)) {
                        cVar.element = mvThemeData2.f140624g;
                        cVar2.element = mvThemeData2.f140625h;
                    }
                    if (l.a((Object) "AspectFill", (Object) mvThemeData2.f140623f)) {
                        cVar3.element = 1;
                    } else if (l.a((Object) "AspectFit", (Object) mvThemeData2.f140623f)) {
                        cVar3.element = 3;
                    } else if (l.a((Object) "AspectWidth", (Object) mvThemeData2.f140623f)) {
                        cVar3.element = 2;
                    } else if (l.a((Object) "FreeMode", (Object) mvThemeData2.f140623f)) {
                        cVar3.element = 4;
                    } else if (l.a((Object) "CenterZoom", (Object) mvThemeData2.f140623f)) {
                        cVar3.element = 5;
                    }
                }
                dVar.srcSelectMediaList.clear();
                dVar.srcSelectMediaList.addAll(dVar.selectMediaList);
                if (com.ss.android.ugc.aweme.setting.i.i.a()) {
                    bz unused = kotlinx.coroutines.i.a(bs.f159054a, bf.f159041b, null, new c(eVar, dVar, cVar, cVar2, cVar3, null), 2);
                } else {
                    b.i.b(new d(eVar, dVar, cVar, cVar2, cVar3), b.i.f4824a).a(new C3722e(eVar, dVar), b.i.f4826c, null);
                }
            }
            if (str == null || musicModel == null) {
                i4 = 2;
            }
            e.a(i4, this.f140764a.f140753i, this.f140768e.size());
        }

        g(e eVar, a.d dVar, ShortVideoContext shortVideoContext, IPhotoPreDownloadMusic iPhotoPreDownloadMusic, List list, z.e eVar2, b bVar) {
            this.f140764a = eVar;
            this.f140765b = dVar;
            this.f140766c = shortVideoContext;
            this.f140768e = list;
            this.f140769f = eVar2;
            this.f140770g = bVar;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f140757a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mvtheme.d f140758b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f140759c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.c f140760d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.c f140761e;

        static {
            Covode.recordClassIndex(91913);
        }

        d(e eVar, com.ss.android.ugc.aweme.mvtheme.d dVar, z.c cVar, z.c cVar2, z.c cVar3) {
            this.f140757a = eVar;
            this.f140758b = dVar;
            this.f140759c = cVar;
            this.f140760d = cVar2;
            this.f140761e = cVar3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList arrayList = new ArrayList();
            String str = com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a("resize_bitmap_tmp") + File.separator;
            ArrayList<String> arrayList2 = this.f140758b.selectMediaList;
            l.b(arrayList2, "");
            p<Integer, Integer> a2 = a.a(arrayList2, new p(Integer.valueOf(this.f140759c.element), Integer.valueOf(this.f140760d.element)));
            Iterator<String> it = this.f140758b.selectMediaList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                e eVar = this.f140757a;
                l.b(next, "");
                String a3 = eVar.a(next, str + com.ss.android.ugc.aweme.tools.mvtemplate.e.b.c(".bmp"), this.f140761e.element, a2);
                if (!(a3 == null || a3.length() == 0)) {
                    arrayList.add(a3);
                }
            }
            if (arrayList.size() > 0) {
                this.f140758b.selectMediaList.clear();
                this.f140758b.selectMediaList.addAll(arrayList);
            }
            return a2;
        }
    }

    static final class f extends m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ b $listener;

        static {
            Covode.recordClassIndex(91915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.$listener = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            b bVar = this.$listener;
            if (bVar != null) {
                bVar.a(booleanValue);
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.e$e  reason: collision with other inner class name */
    static final class C3722e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f140762a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mvtheme.d f140763b;

        static {
            Covode.recordClassIndex(91914);
        }

        C3722e(e eVar, com.ss.android.ugc.aweme.mvtheme.d dVar) {
            this.f140762a = eVar;
            this.f140763b = dVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            b bVar = this.f140762a.f140750f;
            if (bVar != null) {
                bVar.a(true);
            }
            this.f140762a.a(this.f140763b);
            e.a((int) this.f140762a.f140752h.a("resize image", "success"), this.f140763b.selectMediaList.size());
            e eVar = this.f140762a;
            com.ss.android.ugc.aweme.mvtheme.d dVar = this.f140763b;
            l.b(iVar, "");
            eVar.a(dVar, (p) iVar.d());
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ z.c $resizeBitmapHeight;
        final /* synthetic */ z.c $resizeBitmapMode;
        final /* synthetic */ z.c $resizeBitmapWidth;
        final /* synthetic */ com.ss.android.ugc.aweme.mvtheme.d $videoData;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(91910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, com.ss.android.ugc.aweme.mvtheme.d dVar, z.c cVar, z.c cVar2, z.c cVar3, h.c.d dVar2) {
            super(2, dVar2);
            this.this$0 = eVar;
            this.$videoData = dVar;
            this.$resizeBitmapWidth = cVar;
            this.$resizeBitmapHeight = cVar2;
            this.$resizeBitmapMode = cVar3;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            c cVar = new c(this.this$0, this.$videoData, this.$resizeBitmapWidth, this.$resizeBitmapHeight, this.$resizeBitmapMode, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00cb A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
            // Method dump skipped, instructions count: 212
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.a.e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(com.ss.android.ugc.aweme.mvtheme.d dVar) {
        if (cx.a() && dh.a() != 0 && !com.ss.android.ugc.aweme.port.in.g.a().A().a() && !AVCommerceServiceImpl.h().a() && com.ss.android.ugc.aweme.port.in.c.u.b()) {
            new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.a(new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b(null, new WeakReference(this.f140754j), null, null, dVar.srcSelectMediaList, "", 448)).a(null);
        }
    }

    public e(androidx.fragment.app.e eVar, boolean z) {
        l.d(eVar, "");
        this.f140754j = eVar;
        this.r = z;
        this.f140755l = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a(eVar);
    }

    public static void a(int i2, int i3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", i2);
        q.a("aweme_photomv_generate_duration", jSONObject, new ar().a("pictureCount", Integer.valueOf(i3)).a());
    }

    public final void a(com.ss.android.ugc.aweme.mvtheme.d dVar, p<Integer, Integer> pVar) {
        ShortVideoContext shortVideoContext;
        boolean z;
        List<String> list;
        String str;
        ArrayList<? extends Parcelable> arrayList;
        String str2;
        if (dVar.selectMediaList.isEmpty()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f140754j).a(this.f140754j.getString(R.string.cjq)).a();
            return;
        }
        boolean a2 = com.ss.android.ugc.aweme.port.in.g.a().A().a();
        String str3 = "multiple_content";
        String str4 = UGCMonitor.TYPE_PHOTO;
        int i2 = 0;
        boolean z2 = true;
        if (a2) {
            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("content_type", str4);
            if (dVar.selectMediaList.size() <= 1) {
                str3 = "single_content";
            }
            r.a("upload_content_next", a3.a("upload_type", str3).f149193a);
        } else {
            if (this.f140749e != null) {
                shortVideoContext = this.f140749e;
                if (shortVideoContext == null) {
                    l.a("shortVideoContext");
                }
            } else {
                shortVideoContext = null;
            }
            ShortVideoContext shortVideoContext2 = this.f140749e;
            if (shortVideoContext2 == null) {
                l.a("shortVideoContext");
            }
            if (!l.a((Object) shortVideoContext2.f124759d, (Object) "slide_mini")) {
                if (dVar.selectMediaList.size() <= 1) {
                    str3 = "single_content";
                }
                int size = dVar.selectMediaList.size();
                if (dVar.selectMediaList.size() <= 1) {
                    str4 = "none";
                }
                if (dVar.selectMediaList.size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.f(shortVideoContext, "slideshow", str3, 0, size, str4, z).a(shortVideoContext).a();
            }
        }
        Intent intent = new Intent();
        MvThemeData mvThemeData = this.f140745a;
        if (mvThemeData != null) {
            list = mvThemeData.b();
        } else {
            list = null;
        }
        dVar.musicIds = list;
        androidx.fragment.app.e eVar = this.f140754j;
        MvThemeData mvThemeData2 = this.f140745a;
        if (mvThemeData2 != null) {
            str = mvThemeData2.a();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.utils.ad.a(eVar, str, 2);
        MvThemeData mvThemeData3 = this.f140745a;
        if (mvThemeData3 != null && !TextUtils.isEmpty(mvThemeData3.a())) {
            com.ss.android.ugc.aweme.shortvideo.i iVar = new com.ss.android.ugc.aweme.shortvideo.i();
            iVar.mvThemeId = mvThemeData3.a();
            MvModel mvModel = new MvModel();
            mvModel.setMvId(mvThemeData3.a());
            mvModel.setName(mvThemeData3.f140618a.getName());
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(mvThemeData3.f140618a.getIconUrl().getUrlList());
            mvModel.setIconUrl(urlModel);
            iVar.mvInfo = mvModel;
            intent.putExtra("av_upload_struct", iVar);
            String a4 = mvThemeData3.a();
            ShortVideoContext shortVideoContext3 = this.f140749e;
            if (shortVideoContext3 == null) {
                l.a("shortVideoContext");
            }
            if (TextUtils.equals(a4, shortVideoContext3.am)) {
                ShortVideoContext shortVideoContext4 = this.f140749e;
                if (shortVideoContext4 == null) {
                    l.a("shortVideoContext");
                }
                intent.putExtra("extra_bind_mv_id", shortVideoContext4.am);
            }
            dVar.mvResUnzipPath = mvThemeData3.d();
            dVar.mvType = mvThemeData3.f140627j;
            dVar.mvAutoSaveToast = mvThemeData3.f140630m;
        }
        dVar.contactVideoPath = com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a("contact_video") + File.separator + com.ss.android.ugc.aweme.tools.mvtemplate.e.b.c(".mp4");
        intent.putExtra("key_mv_theme_data", dVar);
        intent.putExtra("key_mv_theme_enter", true);
        AVETParameter aVETParameter = this.f140746b;
        String str5 = "";
        if (aVETParameter != null) {
            cr a5 = cr.a();
            l.b(a5, str5);
            List list2 = a5.f125298d;
            if (this.f140756m != null) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                AVChallenge aVChallenge = this.f140756m;
                if (aVChallenge == null) {
                    l.b();
                }
                list2.add(aVChallenge);
            }
            if (pVar != null) {
                Parcelable a6 = new com.ss.android.ugc.aweme.shortvideo.edit.model.f(pVar.getFirst().intValue(), pVar.getSecond().intValue()).a(dVar);
                Objects.requireNonNull(a6, "null cannot be cast to non-null type android.os.Parcelable");
                intent.putExtra("extra_edit_preview_info", a6);
            } else if (cy.a.a().f118429a) {
                Parcelable a7 = new com.ss.android.ugc.aweme.shortvideo.edit.model.f(1080, 1920).a(dVar);
                Objects.requireNonNull(a7, "null cannot be cast to non-null type android.os.Parcelable");
                intent.putExtra("extra_edit_preview_info", a7);
            } else {
                Parcelable a8 = new com.ss.android.ugc.aweme.shortvideo.edit.model.f(720, 1280).a(dVar);
                Objects.requireNonNull(a8, "null cannot be cast to non-null type android.os.Parcelable");
                intent.putExtra("extra_edit_preview_info", a8);
            }
            intent.putExtra("challenge", (Serializable) list2);
            ShortVideoContext shortVideoContext5 = this.f140749e;
            if (shortVideoContext5 == null) {
                l.a("shortVideoContext");
            }
            if (TextUtils.equals(shortVideoContext5.x, "open_platform_share")) {
                ShortVideoContext shortVideoContext6 = this.f140749e;
                if (shortVideoContext6 == null) {
                    l.a("shortVideoContext");
                }
                intent.putExtra("shoot_way", shortVideoContext6.r);
                ShortVideoContext shortVideoContext7 = this.f140749e;
                if (shortVideoContext7 == null) {
                    l.a("shortVideoContext");
                }
                intent.putExtra("creation_id", shortVideoContext7.q);
                ShortVideoContext shortVideoContext8 = this.f140749e;
                if (shortVideoContext8 == null) {
                    l.a("shortVideoContext");
                }
                if (shortVideoContext8.A != null) {
                    ShortVideoContext shortVideoContext9 = this.f140749e;
                    if (shortVideoContext9 == null) {
                        l.a("shortVideoContext");
                    }
                    intent.putExtra("extra_share_context", shortVideoContext9.A);
                    ShortVideoContext shortVideoContext10 = this.f140749e;
                    if (shortVideoContext10 == null) {
                        l.a("shortVideoContext");
                    }
                    ArrayList arrayList2 = shortVideoContext10.A.mHashTags;
                    l.b(arrayList2, str5);
                    if (!arrayList2.isEmpty()) {
                        if (list2 == null) {
                            list2 = new ArrayList();
                        }
                        ShortVideoContext shortVideoContext11 = this.f140749e;
                        if (shortVideoContext11 == null) {
                            l.a("shortVideoContext");
                        }
                        Iterator it = shortVideoContext11.A.mHashTags.iterator();
                        while (it.hasNext()) {
                            AVChallenge aVChallenge2 = new AVChallenge();
                            aVChallenge2.challengeName = (String) it.next();
                            list2.add(aVChallenge2);
                        }
                    }
                }
            } else {
                intent.putExtra("shoot_way", aVETParameter.getShootWay());
                l.b(intent.putExtra("creation_id", aVETParameter.getCreationId()), str5);
            }
            ShortVideoContext shortVideoContext12 = this.f140749e;
            if (shortVideoContext12 == null) {
                l.a("shortVideoContext");
            }
            intent.putExtra("is_rivate", shortVideoContext12.L);
            intent.putExtra("shoot_mode", aVETParameter.getShootMode());
            intent.putExtra("draft_id", aVETParameter.getDraftId());
            intent.putExtra("new_draft_id", aVETParameter.getNewDraftId());
            intent.putExtra("origin", this.r ? 1 : 0);
            intent.putExtra("content_type", "slideshow");
            intent.putExtra("content_source", "upload");
            ShortVideoContext shortVideoContext13 = this.f140749e;
            if (shortVideoContext13 == null) {
                l.a("shortVideoContext");
            }
            intent.putExtra("tag_id", shortVideoContext13.Y);
            ShortVideoContext shortVideoContext14 = this.f140749e;
            if (shortVideoContext14 == null) {
                l.a("shortVideoContext");
            }
            intent.putExtra("shout_out_data", shortVideoContext14.ab);
            ShortVideoContext shortVideoContext15 = this.f140749e;
            if (shortVideoContext15 == null) {
                l.a("shortVideoContext");
            }
            intent.putExtra("creative_flow_data", shortVideoContext15.f124756a);
            ShortVideoContext shortVideoContext16 = this.f140749e;
            if (shortVideoContext16 == null) {
                l.a("shortVideoContext");
            }
            intent.putExtra("share_id", shortVideoContext16.f124763h);
            ShortVideoContext shortVideoContext17 = this.f140749e;
            if (shortVideoContext17 == null) {
                l.a("shortVideoContext");
            }
            intent.putExtra("channel", shortVideoContext17.B);
            ShortVideoContext shortVideoContext18 = this.f140749e;
            if (shortVideoContext18 == null) {
                l.a("shortVideoContext");
            }
            intent.putExtra("comment_video_model", shortVideoContext18.f124767l);
            ShortVideoContext shortVideoContext19 = this.f140749e;
            if (shortVideoContext19 == null) {
                l.a("shortVideoContext");
            }
            intent.putExtra("question_answer_video_model", shortVideoContext19.f124768m);
            intent.putExtra("extra_start_enter_edit_page", this.n);
            intent.putExtra("use_music_before_edit", true);
            FaceStickerBean faceStickerBean = this.p;
            if (faceStickerBean != null) {
                String valueOf = String.valueOf(faceStickerBean.getStickerId());
                if (valueOf == null) {
                    valueOf = str5;
                }
                intent.putExtra("sticker_id", valueOf);
            }
            String str6 = this.f140748d;
            if (!(str6 == null || this.f140747c == null)) {
                intent.putExtra("path", str6);
                intent.putExtra("music_model", this.f140747c);
                if (this.f140751g) {
                    ShortVideoContext shortVideoContext20 = this.f140749e;
                    if (shortVideoContext20 == null) {
                        l.a("shortVideoContext");
                    }
                    str2 = shortVideoContext20.f124765j;
                } else {
                    str2 = "slideshow_rec";
                }
                intent.putExtra("music_origin", str2);
                com.google.gson.f fVar = new com.google.gson.f();
                MusicModel musicModel = this.f140747c;
                if (musicModel == null) {
                    l.b();
                }
                intent.putExtra("first_sticker_music_ids", fVar.b(n.a(musicModel.getMusicId())));
                MusicModel musicModel2 = this.f140747c;
                if (musicModel2 == null) {
                    l.b();
                }
                intent.putExtra("id", musicModel2.getMusicId());
            }
            ShortVideoContext shortVideoContext21 = this.f140749e;
            if (shortVideoContext21 == null) {
                l.a("shortVideoContext");
            }
            intent.putExtra("workspace", shortVideoContext21.f124757b.f124713h);
            intent.putExtra("extra_photo_mv_mode", true);
            if (!SettingsManager.a().a("enable_1080p_photo_mv", false) && !cy.a.a().f118429a) {
                z2 = false;
            }
            intent.putExtra("extra_photo_mv_mode_1080p", z2);
            ShortVideoContext shortVideoContext22 = this.f140749e;
            if (shortVideoContext22 == null) {
                l.a("shortVideoContext");
            }
            intent.putExtra("is_photo_mv_music", shortVideoContext22.P);
            List<? extends MediaModel> list3 = this.q;
            if (list3 != null) {
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(n.a((Iterable) list3, 10));
                for (T t : list3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    int i4 = t2.f109400l;
                    int i5 = t2.f109401m;
                    long j2 = t2.f109396h;
                    arrayList3.add(new ImportVideoInfo(i4, i5, 0, 0, String.valueOf(i2), (long) (t2.r - t2.q), j2, null, null, 0, 0.0f, t2.f109390b, 1932, null));
                    i2 = i3;
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            if (!(arrayList instanceof ArrayList)) {
                arrayList = null;
            }
            ArrayList<? extends Parcelable> arrayList4 = arrayList;
            if (arrayList4 != null) {
                intent.putParcelableArrayListExtra("extra_import_video_info_list", arrayList4);
            }
            ShortVideoContext shortVideoContext23 = this.f140749e;
            if (shortVideoContext23 == null) {
                l.a("shortVideoContext");
            }
            intent.putExtra("commerce_data_in_tools_line", shortVideoContext23.af.f124735c);
        }
        intent.putExtra("extra_request_code", 12346);
        ShortVideoContext shortVideoContext24 = this.f140749e;
        if (shortVideoContext24 == null) {
            l.a("shortVideoContext");
        }
        intent.putExtra("enter_method", shortVideoContext24.y);
        ShortVideoContext shortVideoContext25 = this.f140749e;
        if (shortVideoContext25 == null) {
            l.a("shortVideoContext");
        }
        String str7 = shortVideoContext25.f124759d;
        if (str7 != null) {
            str5 = str7;
        }
        intent.putExtra("upload_method", str5);
        ShortVideoContext shortVideoContext26 = this.f140749e;
        if (shortVideoContext26 == null) {
            l.a("shortVideoContext");
        }
        dm.a(intent, shortVideoContext26);
        VEVideoPublishEditActivity.a((Activity) this.f140754j, intent);
    }

    private final void a(String str, MediaModel mediaModel, h.f.a.b<? super Boolean, h.z> bVar) {
        com.ss.android.ugc.aweme.record.d l2 = com.ss.android.ugc.aweme.port.in.g.a().l();
        androidx.fragment.app.e eVar = this.f140754j;
        ShortVideoContext shortVideoContext = this.f140749e;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        l2.photoCanvasGoNext(eVar, str, shortVideoContext, this.p, true, mediaModel, bVar);
    }

    public static void a(int i2, d dVar, int i3) {
        String str;
        l.d(dVar, "");
        ar arVar = new ar();
        if (i3 > 1) {
            str = "multi";
        } else {
            str = "single";
        }
        q.a("aweme_photomv_synthesis_error_rate", i2, arVar.a("photo_import_mode", str).a("mvtemplate_list_download_time", Integer.valueOf(dVar.f140733b)).a("mvtemplate_download_time", Integer.valueOf(dVar.f140734c)).a("mvtemplate_use_predownload", Integer.valueOf(dVar.f140735d)).a("hot_music_list_download_time", Integer.valueOf(dVar.f140736e)).a("hot_music_list_list_size", Integer.valueOf(dVar.f140737f)).a("music_download_time", Integer.valueOf(dVar.f140738g)).a("music_id", dVar.f140739h).a("error_code", Integer.valueOf(dVar.f140740i)).a("failed_step", Integer.valueOf(dVar.f140742k)).a("failed_reason", dVar.f140743l).a());
    }

    public final String a(String str, String str2, int i2, p<Integer, Integer> pVar) {
        if (!i.a(str)) {
            return null;
        }
        if (this.o.containsKey(str)) {
            return this.o.get(str);
        }
        if (co.b()) {
            this.o.put(str, str);
            return str;
        }
        int[] a2 = com.ss.android.ugc.aweme.ci.a.a(str);
        if (a2 == null) {
            return str;
        }
        if (a2[0] <= 1080 && a2[1] <= 1920 && co.a() == 1) {
            this.o.put(str, str);
            return str;
        } else if (!com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a(str, str2, pVar.getFirst().intValue(), pVar.getSecond().intValue(), i2, Bitmap.CompressFormat.JPEG)) {
            return str;
        } else {
            this.o.put(str, str2);
            return str2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f5, code lost:
        if (r9.equals("multi") != false) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r30, java.util.List<java.lang.String> r31, com.ss.android.ugc.aweme.tools.mvtemplate.a.e.b r32, boolean r33, java.lang.Long r34, boolean r35, java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r36) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.a.e.a(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.util.List, com.ss.android.ugc.aweme.tools.mvtemplate.a.e$b, boolean, java.lang.Long, boolean, java.util.List):void");
    }
}
