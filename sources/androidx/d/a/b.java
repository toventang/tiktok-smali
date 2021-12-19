package androidx.d.a;

import android.database.Cursor;
import android.widget.Filter;
import com.bytedance.covode.number.Covode;

final class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f2679a;

    interface a {
        static {
            Covode.recordClassIndex(921);
        }

        Cursor a();

        Cursor a(CharSequence charSequence);

        void a(Cursor cursor);

        CharSequence b(Cursor cursor);
    }

    static {
        Covode.recordClassIndex(920);
    }

    b(a aVar) {
        this.f2679a = aVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f2679a.b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a2 = this.f2679a.a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a2 != null) {
            filterResults.count = a2.getCount();
            filterResults.values = a2;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a2 = this.f2679a.a();
        if (filterResults.values != null && filterResults.values != a2) {
            this.f2679a.a((Cursor) filterResults.values);
        }
    }
}
