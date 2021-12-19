package androidx.loader.a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.d.a;
import androidx.core.d.d;
import androidx.loader.a.c;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class b extends a<Cursor> {

    /* renamed from: f  reason: collision with root package name */
    final c<Cursor>.a f3582f = new c.a();

    /* renamed from: g  reason: collision with root package name */
    public Uri f3583g;

    /* renamed from: h  reason: collision with root package name */
    public String[] f3584h;

    /* renamed from: i  reason: collision with root package name */
    public String f3585i;

    /* renamed from: j  reason: collision with root package name */
    public String[] f3586j;

    /* renamed from: k  reason: collision with root package name */
    public String f3587k;

    /* renamed from: l  reason: collision with root package name */
    Cursor f3588l;

    /* renamed from: m  reason: collision with root package name */
    a f3589m;

    static {
        Covode.recordClassIndex(1355);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.a.c
    public final void h() {
        k();
    }

    @Override // androidx.loader.a.a
    public final void e() {
        super.e();
        synchronized (this) {
            a aVar = this.f3589m;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.a.c
    public final void g() {
        Cursor cursor = this.f3588l;
        if (cursor != null) {
            b(cursor);
        }
        boolean z = this.t;
        this.t = false;
        this.u |= z;
        if (z || this.f3588l == null) {
            l();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.a.c
    public final void i() {
        super.i();
        k();
        Cursor cursor = this.f3588l;
        if (cursor != null && !cursor.isClosed()) {
            this.f3588l.close();
        }
        this.f3588l = null;
    }

    /* renamed from: f */
    public Cursor d() {
        boolean z;
        synchronized (this) {
            if (this.f3574b != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f3589m = new a();
            } else {
                throw new d();
            }
        }
        try {
            Cursor a2 = androidx.core.content.a.a(this.p.getContentResolver(), this.f3583g, this.f3584h, this.f3585i, this.f3586j, this.f3587k, this.f3589m);
            if (a2 != null) {
                try {
                    a2.getCount();
                    a2.registerContentObserver(this.f3582f);
                } catch (RuntimeException e2) {
                    a2.close();
                    throw e2;
                }
            }
            synchronized (this) {
                this.f3589m = null;
            }
            return a2;
        } catch (Throwable th) {
            synchronized (this) {
                this.f3589m = null;
                throw th;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.loader.a.a
    public final /* synthetic */ void a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 != null && !cursor2.isClosed()) {
            cursor2.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void b(Cursor cursor) {
        if (!this.s) {
            Cursor cursor2 = this.f3588l;
            this.f3588l = cursor;
            if (this.q) {
                super.b(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @Override // androidx.loader.a.c, androidx.loader.a.a
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f3583g);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f3584h));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f3585i);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f3586j));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f3587k);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f3588l);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.t);
    }

    public b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f3583g = uri;
        this.f3584h = strArr;
        this.f3585i = str;
        this.f3586j = strArr2;
        this.f3587k = str2;
    }
}
