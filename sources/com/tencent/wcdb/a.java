package com.tencent.wcdb;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.support.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    protected HashMap<Long, Map<String, Object>> f154527a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    protected int f154528b = -1;

    /* renamed from: c  reason: collision with root package name */
    protected int f154529c = -1;

    /* renamed from: d  reason: collision with root package name */
    protected Long f154530d = null;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f154531e;

    /* renamed from: f  reason: collision with root package name */
    protected ContentResolver f154532f;

    /* renamed from: g  reason: collision with root package name */
    final Object f154533g = new Object();

    /* renamed from: h  reason: collision with root package name */
    final ContentObservable f154534h = new ContentObservable();

    /* renamed from: i  reason: collision with root package name */
    private Uri f154535i;

    /* renamed from: j  reason: collision with root package name */
    private ContentObserver f154536j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f154537k;

    /* renamed from: l  reason: collision with root package name */
    private final DataSetObservable f154538l = new DataSetObservable();

    /* renamed from: m  reason: collision with root package name */
    private Bundle f154539m = Bundle.EMPTY;

    static {
        Covode.recordClassIndex(103005);
    }

    public boolean a(int i2) {
        return true;
    }

    public abstract String[] getColumnNames();

    @Override // com.tencent.wcdb.d
    public abstract int getCount();

    @Override // com.tencent.wcdb.d
    public abstract long getLong(int i2);

    @Override // com.tencent.wcdb.d
    public abstract String getString(int i2);

    public int getType(int i2) {
        return 3;
    }

    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    public void deactivate() {
        a();
    }

    public Bundle getExtras() {
        return this.f154539m;
    }

    public Uri getNotificationUri() {
        return this.f154535i;
    }

    public final int getPosition() {
        return this.f154528b;
    }

    public boolean isClosed() {
        return this.f154531e;
    }

    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // com.tencent.wcdb.d
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // java.io.Closeable, com.tencent.wcdb.d, java.lang.AutoCloseable
    public void close() {
        this.f154531e = true;
        this.f154534h.unregisterAll();
        a();
    }

    public final boolean isBeforeFirst() {
        if (getCount() == 0 || this.f154528b == -1) {
            return true;
        }
        return false;
    }

    public final boolean isFirst() {
        if (this.f154528b != 0 || getCount() == 0) {
            return false;
        }
        return true;
    }

    public final boolean isLast() {
        int count = getCount();
        if (this.f154528b != count - 1 || count == 0) {
            return false;
        }
        return true;
    }

    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // com.tencent.wcdb.d
    public final boolean moveToNext() {
        return moveToPosition(this.f154528b + 1);
    }

    public final boolean moveToPrevious() {
        return moveToPosition(this.f154528b - 1);
    }

    /* access modifiers changed from: protected */
    public void a() {
        ContentObserver contentObserver = this.f154536j;
        if (contentObserver != null) {
            this.f154532f.unregisterContentObserver(contentObserver);
            this.f154537k = false;
        }
        this.f154538l.notifyInvalidated();
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (-1 == this.f154528b || getCount() == this.f154528b) {
            throw new e(this.f154528b, getCount());
        }
    }

    @Override // java.lang.Object
    public void finalize() {
        ContentObserver contentObserver = this.f154536j;
        if (contentObserver != null && this.f154537k) {
            this.f154532f.unregisterContentObserver(contentObserver);
        }
        try {
            if (!this.f154531e) {
                close();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean isAfterLast() {
        if (getCount() == 0 || this.f154528b == getCount()) {
            return true;
        }
        return false;
    }

    public boolean requery() {
        ContentObserver contentObserver = this.f154536j;
        if (contentObserver != null && !this.f154537k) {
            this.f154532f.registerContentObserver(this.f154535i, true, contentObserver);
            this.f154537k = true;
        }
        this.f154538l.notifyChanged();
        return true;
    }

    public Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    public byte[] getBlob(int i2) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    public String getColumnName(int i2) {
        return getColumnNames()[i2];
    }

    public final boolean move(int i2) {
        return moveToPosition(this.f154528b + i2);
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.f154534h.registerObserver(contentObserver);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f154538l.registerObserver(dataSetObserver);
    }

    public void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.f154539m = bundle;
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f154538l.unregisterObserver(dataSetObserver);
    }

    /* renamed from: com.tencent.wcdb.a$a  reason: collision with other inner class name */
    protected static class C4111a extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<a> f154540a;

        static {
            Covode.recordClassIndex(103006);
        }

        public final boolean deliverSelfNotifications() {
            return false;
        }

        public C4111a(a aVar) {
            super(null);
            this.f154540a = new WeakReference<>(aVar);
        }

        public final void onChange(boolean z) {
            MethodCollector.i(1783);
            a aVar = this.f154540a.get();
            if (aVar != null) {
                synchronized (aVar.f154533g) {
                    try {
                        aVar.f154534h.dispatchChange(false);
                    } finally {
                        MethodCollector.o(1783);
                    }
                }
                return;
            }
            MethodCollector.o(1783);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        if (!this.f154531e) {
            this.f154534h.unregisterObserver(contentObserver);
        }
    }

    @Override // com.tencent.wcdb.d
    public int getColumnIndex(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            Log.a("Cursor", "requesting column name with table name -- ".concat(String.valueOf(str)), exc);
            str = str.substring(lastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (columnNames[i2].equalsIgnoreCase(str)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist");
    }

    public boolean moveToPosition(int i2) {
        int count = getCount();
        if (i2 >= count) {
            this.f154528b = count;
            return false;
        } else if (i2 < 0) {
            this.f154528b = -1;
            return false;
        } else if (i2 == this.f154528b) {
            return true;
        } else {
            a(i2);
            this.f154528b = i2;
            int i3 = this.f154529c;
            if (i3 != -1) {
                this.f154530d = Long.valueOf(getLong(i3));
            }
            return true;
        }
    }

    public void copyStringToBuffer(int i2, CharArrayBuffer charArrayBuffer) {
        String string = getString(i2);
        if (string != null) {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < string.length()) {
                charArrayBuffer.data = string.toCharArray();
            } else {
                string.getChars(0, string.length(), cArr, 0);
            }
            charArrayBuffer.sizeCopied = string.length();
            return;
        }
        charArrayBuffer.sizeCopied = 0;
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.f154533g) {
            this.f154535i = uri;
            this.f154532f = contentResolver;
            ContentObserver contentObserver = this.f154536j;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            C4111a aVar = new C4111a(this);
            this.f154536j = aVar;
            this.f154532f.registerContentObserver(this.f154535i, true, aVar);
            this.f154537k = true;
        }
    }
}
