package com.ss.android.ugc.aweme.tools.extract.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.extract.aa;
import com.ss.android.ugc.aweme.tools.extract.ab;
import com.ss.android.ugc.aweme.tools.extract.z;
import com.ss.android.ugc.aweme.utils.cd;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f139998a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(91496);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f139999a;

        /* renamed from: b  reason: collision with root package name */
        public final int f140000b;

        /* renamed from: c  reason: collision with root package name */
        public final String f140001c;

        static {
            Covode.recordClassIndex(91497);
        }

        public static a a(int i2, int i3, String str) {
            l.d(str, "");
            return new a(i2, i3, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f139999a == aVar.f139999a && this.f140000b == aVar.f140000b && l.a(this.f140001c, aVar.f140001c);
        }

        public final int hashCode() {
            int i2 = ((this.f139999a * 31) + this.f140000b) * 31;
            String str = this.f140001c;
            return i2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "ResultData(code=" + this.f139999a + ", frameCount=" + this.f140000b + ", msg=" + this.f140001c + ")";
        }

        public /* synthetic */ a(int i2) {
            this(-2, i2, "");
        }

        private a(int i2, int i3, String str) {
            l.d(str, "");
            this.f139999a = i2;
            this.f140000b = i3;
            this.f140001c = str;
        }
    }

    public static p<Integer, String> a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        ArrayList<e> arrayList = new ArrayList();
        arrayList.add(new g());
        arrayList.add(new c());
        for (e eVar : arrayList) {
            p<Integer, String> a2 = eVar.a(videoPublishEditModel, 0);
            if (a2.getFirst().intValue() != -2) {
                return a2;
            }
        }
        return v.a(-1, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11) {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.extract.a.i.b(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):int");
    }

    public static a a(VideoPublishEditModel videoPublishEditModel, int i2) {
        int i3;
        int i4;
        List<z> uploadFrameInfoList;
        new a(i2);
        if (videoPublishEditModel.hasImageStickers()) {
            int size = b.a(videoPublishEditModel.extractFramesModel.getExtractFramesDir()).size();
            if (size == 0) {
                return a.a(10, size, "custom sticker count == 0");
            }
            i3 = size + 0;
        } else {
            i3 = 0;
        }
        cd.a(videoPublishEditModel);
        boolean z = true;
        if (videoPublishEditModel.containBackgroundVideo) {
            ArrayList<z> a2 = aa.a(videoPublishEditModel);
            if (a2 != null && !a2.isEmpty()) {
                z = false;
            }
            if (z) {
                return a.a(11, 0, "segments size == 0");
            }
            Iterator<T> it = a2.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                i5 += (int) (it.next().f140189c / 500);
            }
            if (i5 == 0) {
                return a.a(11, 0, "bg video count == 0");
            }
            i3 += i5;
        } else if (cd.a(videoPublishEditModel)) {
            j jVar = ab.f140003a;
            if (jVar == null || (uploadFrameInfoList = jVar.getUploadFrameInfoList()) == null || uploadFrameInfoList.isEmpty()) {
                i4 = 0;
            } else {
                Iterator<T> it2 = jVar.getUploadFrameInfoList().iterator();
                i4 = 0;
                while (it2.hasNext()) {
                    i4 += it2.next().f140191e;
                }
            }
            Iterator<T> it3 = videoPublishEditModel.extractFramesModel.getAllFrames().iterator();
            int i6 = 0;
            while (it3.hasNext()) {
                if (h.m.p.a((CharSequence) it3.next().getPath(), (CharSequence) "upload_sticker_frame", false)) {
                    i6++;
                }
            }
            if (i6 != i4) {
                return a.a(17, 0, "upload sticker count:" + i6 + ", size:" + i4);
            }
            i3 += i6;
        }
        return a.a(-2, i2 - i3, "");
    }
}
