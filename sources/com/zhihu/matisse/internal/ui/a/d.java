package com.zhihu.matisse.internal.ui.a;

import android.database.Cursor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;

public abstract class d<VH extends RecyclerView.ViewHolder> extends RecyclerView.a<VH> {

    /* renamed from: a  reason: collision with root package name */
    private int f156476a;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f156477c;

    static {
        Covode.recordClassIndex(103906);
    }

    /* access modifiers changed from: protected */
    public abstract int a(Cursor cursor);

    /* access modifiers changed from: protected */
    public abstract void a(VH vh, Cursor cursor);

    d() {
        setHasStableIds(true);
        b(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        if (c(this.f156477c)) {
            return this.f156477c.getCount();
        }
        return 0;
    }

    private static boolean c(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return false;
        }
        return true;
    }

    public final void b(Cursor cursor) {
        if (cursor != this.f156477c) {
            if (cursor != null) {
                this.f156477c = cursor;
                this.f156476a = cursor.getColumnIndexOrThrow("_id");
                notifyDataSetChanged();
                return;
            }
            notifyItemRangeRemoved(0, getItemCount());
            this.f156477c = null;
            this.f156476a = -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long getItemId(int i2) {
        if (!c(this.f156477c)) {
            throw new IllegalStateException("Cannot lookup item id when cursor is in invalid state.");
        } else if (this.f156477c.moveToPosition(i2)) {
            return this.f156477c.getLong(this.f156476a);
        } else {
            throw new IllegalStateException("Could not move cursor to position " + i2 + " when trying to get an item id");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        if (this.f156477c.moveToPosition(i2)) {
            return a(this.f156477c);
        }
        throw new IllegalStateException("Could not move cursor to position " + i2 + " when trying to get item view type.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(VH vh, int i2) {
        if (!c(this.f156477c)) {
            throw new IllegalStateException("Cannot bind view holder when cursor is in invalid state.");
        } else if (this.f156477c.moveToPosition(i2)) {
            a(vh, this.f156477c);
        } else {
            throw new IllegalStateException("Could not move cursor to position " + i2 + " when trying to bind view holder");
        }
    }
}
