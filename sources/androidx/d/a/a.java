package androidx.d.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.d.a.b;
import com.bytedance.covode.number.Covode;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b  reason: collision with root package name */
    protected boolean f2668b = false;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f2669c = true;

    /* renamed from: d  reason: collision with root package name */
    protected Cursor f2670d = null;

    /* renamed from: e  reason: collision with root package name */
    protected Context f2671e;

    /* renamed from: f  reason: collision with root package name */
    protected int f2672f;

    /* renamed from: g  reason: collision with root package name */
    protected C0039a f2673g;

    /* renamed from: h  reason: collision with root package name */
    protected DataSetObserver f2674h;

    /* renamed from: i  reason: collision with root package name */
    protected b f2675i;

    /* renamed from: j  reason: collision with root package name */
    public FilterQueryProvider f2676j;

    static {
        Covode.recordClassIndex(917);
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void a(View view, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    @Override // androidx.d.a.b.a
    public final Cursor a() {
        return this.f2670d;
    }

    class b extends DataSetObserver {
        static {
            Covode.recordClassIndex(919);
        }

        public final void onChanged() {
            a.this.f2668b = true;
            a.this.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            a.this.f2668b = false;
            a.this.notifyDataSetInvalidated();
        }

        b() {
        }
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f2668b || (cursor = this.f2670d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Filter getFilter() {
        if (this.f2675i == null) {
            this.f2675i = new b(this);
        }
        return this.f2675i;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Cursor cursor;
        if (this.f2669c && (cursor = this.f2670d) != null && !cursor.isClosed()) {
            this.f2668b = this.f2670d.requery();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.d.a.a$a  reason: collision with other inner class name */
    public class C0039a extends ContentObserver {
        static {
            Covode.recordClassIndex(918);
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            a.this.b();
        }

        C0039a() {
            super(new Handler());
        }
    }

    @Override // androidx.d.a.b.a
    public Cursor a(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f2676j;
        if (filterQueryProvider != null) {
            return filterQueryProvider.runQuery(charSequence);
        }
        return this.f2670d;
    }

    @Override // androidx.d.a.b.a
    public CharSequence b(Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f2668b || (cursor = this.f2670d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f2670d;
    }

    public a(Context context) {
        this.f2671e = context;
        this.f2672f = -1;
        this.f2673g = new C0039a();
        this.f2674h = new b();
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.f2668b || (cursor = this.f2670d) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f2670d.getLong(this.f2672f);
    }

    @Override // androidx.d.a.b.a
    public void a(Cursor cursor) {
        Cursor cursor2 = this.f2670d;
        if (cursor != cursor2) {
            if (cursor2 != null) {
                C0039a aVar = this.f2673g;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f2674h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f2670d = cursor;
            if (cursor != null) {
                C0039a aVar2 = this.f2673g;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f2674h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f2672f = cursor.getColumnIndexOrThrow("_id");
                this.f2668b = true;
                notifyDataSetChanged();
            } else {
                this.f2672f = -1;
                this.f2668b = false;
                notifyDataSetInvalidated();
            }
            if (cursor2 != null) {
                cursor2.close();
            }
        }
    }

    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return a(context, cursor, viewGroup);
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f2668b) {
            return null;
        }
        this.f2670d.moveToPosition(i2);
        if (view == null) {
            view = b(this.f2671e, this.f2670d, viewGroup);
        }
        a(view, this.f2670d);
        return view;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f2668b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2670d.moveToPosition(i2)) {
            if (view == null) {
                view = a(this.f2671e, this.f2670d, viewGroup);
            }
            a(view, this.f2670d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position ".concat(String.valueOf(i2)));
        }
    }
}
