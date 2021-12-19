package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import b.i;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.f;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

public final class bt {

    /* renamed from: a  reason: collision with root package name */
    public static final bt f129116a = new bt();

    private bt() {
    }

    static {
        Covode.recordClassIndex(84741);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f129117a;

        static {
            Covode.recordClassIndex(84742);
        }

        a(List list) {
            this.f129117a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            for (MediaModel mediaModel : this.f129117a) {
                if (mediaModel.f109395g == 4) {
                    return VEUtils.getVideoFileInfo(mediaModel.f109390b);
                }
            }
            return null;
        }
    }

    public static void a(List<? extends MediaModel> list) {
        String str;
        l.d(list, "");
        if (g.a().A().a()) {
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("content_type", "video");
            if (list.size() > 1) {
                str = "multiple_content";
            } else {
                str = "single_content";
            }
            r.a("upload_content_next", a2.a("upload_type", str).f149193a);
        }
    }

    static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShortVideoContext f129118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f129119b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f129120c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f129121d;

        static {
            Covode.recordClassIndex(84743);
        }

        b(ShortVideoContext shortVideoContext, List list, int i2, int i3) {
            this.f129118a = shortVideoContext;
            this.f129119b = list;
            this.f129120c = i2;
            this.f129121d = i3;
        }

        @Override // b.g
        public final Object then(i<VEUtils.VEVideoFileInfo> iVar) {
            String str;
            boolean z;
            String str2;
            String str3;
            int i2;
            int i3;
            ShortVideoContext shortVideoContext = this.f129118a;
            List<MediaModel> list = this.f129119b;
            int i4 = this.f129120c;
            int i5 = this.f129121d;
            VEUtils.VEVideoFileInfo d2 = iVar != null ? iVar.d() : null;
            if (list != null) {
                for (MediaModel mediaModel : list) {
                    if (mediaModel.b()) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            mediaModel = null;
            if (list == null) {
                l.b();
            }
            if (list.size() > 1) {
                str = "multiple_content";
            } else {
                str = "single_content";
            }
            int size = list.size() - i4;
            String a2 = com.ss.android.ugc.aweme.shortvideo.ac.b.a(i4, list.size() - i4);
            if (list.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            f a3 = new f(shortVideoContext, "video", str, i4, size, a2, z).b(0).a(i5);
            Integer valueOf = d2 != null ? Integer.valueOf(d2.fps) : null;
            com.ss.android.ugc.tools.f.b bVar = a3.f129282a;
            if (valueOf == null || (str2 = String.valueOf(valueOf.intValue())) == null) {
                str2 = "";
            }
            bVar.a("fps", str2);
            Integer valueOf2 = d2 != null ? Integer.valueOf(d2.bitrate) : null;
            com.ss.android.ugc.tools.f.b bVar2 = a3.f129282a;
            if (valueOf2 == null || (str3 = String.valueOf(valueOf2.intValue())) == null) {
                str3 = "";
            }
            bVar2.a("file_bitrate", str3);
            if (mediaModel != null) {
                i2 = mediaModel.f109400l;
                i3 = mediaModel.f109401m;
            } else {
                i2 = 0;
                i3 = 0;
            }
            String sb = new StringBuilder().append(Math.max(0, i2)).append('*').append(Math.max(0, i3)).toString();
            l.d(sb, "");
            a3.f129282a.a("resolution", sb);
            a3.a(shortVideoContext).a();
            return null;
        }
    }

    public static final void a(int i2, int i3) {
        if (i2 == -6) {
            i2 = 2;
        } else if (i2 == -5) {
            i2 = 0;
        } else if (i2 == -2) {
            i2 = 3;
        } else if (i2 == -1) {
            i2 = 1;
        }
        d.a("tool_performance_asset_unavailable", new com.ss.android.ugc.tools.f.b().a(StringSet.type, i3).a("code", i2).f149193a);
    }

    public static void a(ShortVideoContext shortVideoContext, List<? extends MediaModel> list, int i2, int i3) {
        if (list != null && !list.isEmpty()) {
            i.b(new a(list), i.f4824a).a(new b(shortVideoContext, list, i2, i3), i.f4826c, null);
        }
    }
}
