package com.ss.android.ugc.aweme.story.feed.common.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public class d extends Enum<d> {
    public static final d UPLOADING;
    public static final d UPLOAD_FAIL;
    public static final d UPLOAD_SUCCESS;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ d[] f137658a;
    private final int backgroundColor;
    private final int iconRes;
    private final boolean showIcon;
    private final boolean showRetry;
    private final boolean showXIcon;
    private final int textRes;

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f137658a.clone();
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final boolean getShowIcon() {
        return this.showIcon;
    }

    public final boolean getShowRetry() {
        return this.showRetry;
    }

    public final boolean getShowXIcon() {
        return this.showXIcon;
    }

    public final int getTextRes() {
        return this.textRes;
    }

    static {
        Covode.recordClassIndex(90065);
        a aVar = new a("UPLOADING");
        UPLOADING = aVar;
        d dVar = new d("UPLOAD_FAIL", 1, true, R.raw.icon_exclamation_mark_circle_fill, R.string.g8g, true, true, R.attr.bm);
        UPLOAD_FAIL = dVar;
        d dVar2 = new d("UPLOAD_SUCCESS", 2, true, R.raw.icon_tick_cirlce_fill, R.string.g8l);
        UPLOAD_SUCCESS = dVar2;
        f137658a = new d[]{aVar, dVar, dVar2};
    }

    static final class a extends d {
        static {
            Covode.recordClassIndex(90066);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(String str) {
            super(str, 0, false, 0, R.string.g8m);
        }

        @Override // com.ss.android.ugc.aweme.story.feed.common.b.d
        public final String getText(Context context, float f2) {
            l.d(context, "");
            String string = context.getResources().getString(getTextRes());
            l.b(string, "");
            String a2 = com.a.a(string, Arrays.copyOf(new Object[]{Integer.valueOf((int) (f2 * 100.0f))}, 1));
            l.b(a2, "");
            return a2;
        }
    }

    public String getText(Context context, float f2) {
        l.d(context, "");
        String string = context.getResources().getString(this.textRes);
        l.b(string, "");
        return string;
    }

    /* synthetic */ d(String str, int i2, boolean z, int i3, int i4) {
        this(str, i2, z, i3, i4, false, false, R.attr.a4);
    }

    private d(String str, int i2, boolean z, int i3, int i4, boolean z2, boolean z3, int i5) {
        this.showIcon = z;
        this.iconRes = i3;
        this.textRes = i4;
        this.showRetry = z2;
        this.showXIcon = z3;
        this.backgroundColor = i5;
    }
}
