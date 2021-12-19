package com.tencent.wcdb;

import android.database.CharArrayBuffer;
import com.bytedance.covode.number.Covode;

public abstract class b extends a {

    /* renamed from: i  reason: collision with root package name */
    protected CursorWindow f154541i;

    static {
        Covode.recordClassIndex(103007);
    }

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.a
    public final void a() {
        super.a();
        c();
    }

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.a
    public final void b() {
        super.b();
        if (this.f154541i == null) {
            throw new k("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        CursorWindow cursorWindow = this.f154541i;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.f154541i = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        CursorWindow cursorWindow = this.f154541i;
        if (cursorWindow == null) {
            this.f154541i = new CursorWindow(str);
        } else {
            cursorWindow.a();
        }
    }

    @Override // com.tencent.wcdb.a
    public byte[] getBlob(int i2) {
        b();
        return this.f154541i.b(this.f154528b, i2);
    }

    public double getDouble(int i2) {
        b();
        return this.f154541i.e(this.f154528b, i2);
    }

    public float getFloat(int i2) {
        b();
        return (float) this.f154541i.e(this.f154528b, i2);
    }

    @Override // com.tencent.wcdb.d
    public int getInt(int i2) {
        b();
        return (int) this.f154541i.d(this.f154528b, i2);
    }

    @Override // com.tencent.wcdb.d, com.tencent.wcdb.a
    public long getLong(int i2) {
        b();
        return this.f154541i.d(this.f154528b, i2);
    }

    public short getShort(int i2) {
        b();
        return (short) ((int) this.f154541i.d(this.f154528b, i2));
    }

    @Override // com.tencent.wcdb.d, com.tencent.wcdb.a
    public String getString(int i2) {
        b();
        return this.f154541i.c(this.f154528b, i2);
    }

    @Override // com.tencent.wcdb.a
    public int getType(int i2) {
        b();
        return this.f154541i.a(this.f154528b, i2);
    }

    public boolean isNull(int i2) {
        b();
        if (this.f154541i.a(this.f154528b, i2) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.tencent.wcdb.a
    public void copyStringToBuffer(int i2, CharArrayBuffer charArrayBuffer) {
        b();
        CursorWindow cursorWindow = this.f154541i;
        int i3 = this.f154528b;
        if (charArrayBuffer != null) {
            cursorWindow.d();
            try {
                CursorWindow.nativeCopyStringToBuffer(cursorWindow.f154524a, i3 - cursorWindow.f154525b, i2, charArrayBuffer);
            } finally {
                cursorWindow.e();
            }
        } else {
            throw new IllegalArgumentException("CharArrayBuffer should not be null");
        }
    }
}
