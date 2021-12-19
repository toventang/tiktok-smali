package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.a;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dk implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f126471a;

    static {
        Covode.recordClassIndex(82956);
    }

    dk(String str) {
        this.f126471a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f126471a;
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new a((byte) 0).a(i.f115645a, IVideoRecordPreferences.class);
        if (str == null) {
            str = "";
        }
        iVideoRecordPreferences.setCreativeToolRootDir(str);
        return null;
    }
}
