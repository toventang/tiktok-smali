package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.ArrayList;
import java.util.Collection;

public final class b {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.b$b  reason: collision with other inner class name */
    public static final class C3330b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final C3330b f127778a = new C3330b();

        static {
            Covode.recordClassIndex(83755);
        }

        C3330b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(83753);
    }

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f127777a = new a();

        static {
            Covode.recordClassIndex(83754);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ArrayList<StickerPublishStruct> stickerList;
            StickerPermissionResponse stickerPermissionResponse = (StickerPermissionResponse) obj;
            if (stickerPermissionResponse.status_code == 0 && (stickerList = stickerPermissionResponse.getStickerList()) != null) {
                if (!(stickerList instanceof Collection) || !stickerList.isEmpty()) {
                    for (T t : stickerList) {
                        if (t != null && t.getStickerType() == 10) {
                            new a().a(true);
                            return;
                        }
                    }
                }
            }
        }
    }
}
