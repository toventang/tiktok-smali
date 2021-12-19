package com.zhihu.matisse.internal.ui;

import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhihu.matisse.internal.b.b;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.ui.a.c;
import java.util.ArrayList;

public class AlbumPreviewActivity extends a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private b f156446l = new b();

    /* renamed from: m  reason: collision with root package name */
    private boolean f156447m;

    static {
        Covode.recordClassIndex(103891);
    }

    @Override // com.zhihu.matisse.internal.b.b.a
    public final void a() {
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        a.b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
        this.f156446l.b();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStop() {
        a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.zhihu.matisse.internal.b.b.a
    public final void a(Cursor cursor) {
        if (cursor != null) {
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                arrayList.add(Item.a(cursor));
            }
            if (!arrayList.isEmpty()) {
                c cVar = (c) this.f156450c.getAdapter();
                cVar.a(arrayList);
                cVar.notifyDataSetChanged();
                if (!this.f156447m) {
                    this.f156447m = true;
                    int indexOf = arrayList.indexOf(getIntent().getParcelableExtra("extra_item"));
                    this.f156450c.setCurrentItem(indexOf, false);
                    this.f156456i = indexOf;
                }
            }
        }
    }

    @Override // com.zhihu.matisse.internal.ui.a, androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        super.onCreate(bundle);
        if (!c.a.f156445a.p) {
            setResult(0);
            finish();
            return;
        }
        this.f156446l.a(this, this);
        this.f156446l.a((Album) getIntent().getParcelableExtra("extra_album"), false);
        Item item = (Item) getIntent().getParcelableExtra("extra_item");
        if (this.f156449b.f156437f) {
            this.f156452e.setCheckedNum(this.f156448a.e(item));
        } else {
            this.f156452e.setChecked(this.f156448a.c(item));
        }
        a(item);
    }
}
