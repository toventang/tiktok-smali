package com.zhihu.matisse.internal.a;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class b extends androidx.loader.a.b {
    public static final String[] v = {"1", "3"};
    private static final Uri w = MediaStore.Files.getContentUri("external");
    private static final String[] x = {"_id", "_display_name", "mime_type", "_size", "duration"};
    private final boolean y;

    @Override // androidx.loader.a.c
    public final void o() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // androidx.loader.a.b, androidx.loader.a.a
    public final /* synthetic */ Cursor d() {
        return d();
    }

    static {
        Covode.recordClassIndex(103875);
    }

    @Override // androidx.loader.a.b
    public final Cursor f() {
        Cursor f2 = super.d();
        if (this.y) {
            Context applicationContext = this.p.getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            if (applicationContext.getPackageManager().hasSystemFeature("android.hardware.camera")) {
                MatrixCursor matrixCursor = new MatrixCursor(x);
                matrixCursor.addRow(new Object[]{-1L, "Capture", "", 0, 0});
                return new MergeCursor(new Cursor[]{matrixCursor, f2});
            }
        }
        return f2;
    }

    public static String[] a(int i2) {
        return new String[]{String.valueOf(i2)};
    }

    public static String[] a(int i2, String str) {
        return new String[]{String.valueOf(i2), str};
    }

    public b(Context context, String str, String[] strArr, boolean z) {
        super(context, w, x, str, strArr, "datetaken DESC");
        this.y = z;
    }
}
