package com.ss.android.ugc.effectmanager;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public interface DownloadableModelSupportLibraryLoader {
    static {
        Covode.recordClassIndex(95184);
    }

    void loadLibrary(String str);

    public static class SystemLoader implements DownloadableModelSupportLibraryLoader {
        static {
            Covode.recordClassIndex(95185);
        }

        @Override // com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader
        public void loadLibrary(String str) {
            com_ss_android_ugc_effectmanager_DownloadableModelSupportLibraryLoader$SystemLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
        }

        public static void com_ss_android_ugc_effectmanager_DownloadableModelSupportLibraryLoader$SystemLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.a(str, false, (Context) null);
            m.a(uptimeMillis, str);
        }
    }
}
