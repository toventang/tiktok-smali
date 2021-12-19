package com.zhihu.matisse.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import c.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhihu.matisse.internal.b.a;
import com.zhihu.matisse.internal.b.c;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.ui.AlbumPreviewActivity;
import com.zhihu.matisse.internal.ui.SelectedPreviewActivity;
import com.zhihu.matisse.internal.ui.a.a;
import com.zhihu.matisse.internal.ui.b;
import com.zhihu.matisse.internal.ui.widget.CheckRadioView;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public class MatisseActivity extends d implements View.OnClickListener, AdapterView.OnItemSelectedListener, a.AbstractC4129a, a.b, a.d, a.e, b.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.zhihu.matisse.internal.b.a f156526a = new com.zhihu.matisse.internal.b.a();

    /* renamed from: b  reason: collision with root package name */
    public com.zhihu.matisse.internal.ui.widget.a f156527b;

    /* renamed from: c  reason: collision with root package name */
    private com.zhihu.matisse.internal.c.a f156528c;

    /* renamed from: d  reason: collision with root package name */
    private c f156529d = new c(this);

    /* renamed from: e  reason: collision with root package name */
    private com.zhihu.matisse.internal.entity.c f156530e;

    /* renamed from: f  reason: collision with root package name */
    private com.zhihu.matisse.internal.ui.a.b f156531f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f156532g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f156533h;

    /* renamed from: i  reason: collision with root package name */
    private View f156534i;

    /* renamed from: j  reason: collision with root package name */
    private View f156535j;

    /* renamed from: k  reason: collision with root package name */
    private LinearLayout f156536k;

    /* renamed from: l  reason: collision with root package name */
    private CheckRadioView f156537l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f156538m;

    static {
        Covode.recordClassIndex(103928);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.zhihu.matisse.internal.ui.b.a
    public final c c() {
        return this.f156529d;
    }

    @Override // com.zhihu.matisse.internal.b.a.AbstractC4129a
    public final void a() {
        this.f156531f.swapCursor(null);
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    @Override // com.zhihu.matisse.internal.ui.a.a.b
    public final void b() {
        e();
        if (this.f156530e.q != null) {
            this.f156529d.c();
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        com.zhihu.matisse.internal.b.a aVar = this.f156526a;
        if (aVar.f156401b != null) {
            aVar.f156401b.a(1);
        }
        aVar.f156402c = null;
        this.f156530e.u = null;
        this.f156530e.q = null;
    }

    private int g() {
        int e2 = this.f156529d.e();
        int i2 = 0;
        for (int i3 = 0; i3 < e2; i3++) {
            Item item = this.f156529d.b().get(i3);
            if (item.a() && com.zhihu.matisse.internal.c.b.a(item.f156424d) > ((float) this.f156530e.t)) {
                i2++;
            }
        }
        return i2;
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
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

    private void e() {
        int e2 = this.f156529d.e();
        if (e2 == 0) {
            this.f156532g.setEnabled(false);
            this.f156533h.setEnabled(false);
            this.f156533h.setText(getString(R.string.d2k));
        } else if (e2 != 1 || !this.f156530e.a()) {
            this.f156532g.setEnabled(true);
            this.f156533h.setEnabled(true);
            this.f156533h.setText(getString(R.string.d2j, new Object[]{Integer.valueOf(e2)}));
        } else {
            this.f156532g.setEnabled(true);
            this.f156533h.setText(R.string.d2k);
            this.f156533h.setEnabled(true);
        }
        if (this.f156530e.r) {
            this.f156536k.setVisibility(0);
            f();
            return;
        }
        this.f156536k.setVisibility(4);
    }

    private void f() {
        this.f156537l.setChecked(this.f156538m);
        if (g() > 0 && this.f156538m) {
            com.zhihu.matisse.internal.ui.widget.b.a("", getString(R.string.d2r, new Object[]{Integer.valueOf(this.f156530e.t)})).show(getSupportFragmentManager(), com.zhihu.matisse.internal.ui.widget.b.class.getName());
            this.f156537l.setChecked(false);
            this.f156538m = false;
        }
    }

    @Override // com.zhihu.matisse.internal.ui.a.a.e
    public final void d() {
        Uri uri;
        com.zhihu.matisse.internal.c.a aVar = this.f156528c;
        if (aVar != null) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(getPackageManager()) != null) {
                try {
                    String a2 = com.a.a("JPEG_%s.jpg", new Object[]{new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date())});
                    if (aVar.f156413c.f156426a) {
                        uri = e.a(aVar.f156411a.get(), a2, "image/jpeg");
                    } else {
                        File externalFilesDir = aVar.f156411a.get().getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                        if (aVar.f156413c.f156428c != null) {
                            externalFilesDir = new File(externalFilesDir, aVar.f156413c.f156428c);
                        }
                        File file = new File(externalFilesDir, a2);
                        if ("mounted".equals(androidx.core.d.b.a(file))) {
                            uri = FileProvider.getUriForFile(aVar.f156411a.get(), aVar.f156413c.f156427b, file);
                        } else {
                            return;
                        }
                    }
                    if (uri != null) {
                        aVar.f156414d = uri;
                        intent.putExtra("output", aVar.f156414d);
                        intent.addFlags(2);
                        if (Build.VERSION.SDK_INT < 21) {
                            for (ResolveInfo resolveInfo : getPackageManager().queryIntentActivities(intent, 65536)) {
                                grantUriPermission(resolveInfo.activityInfo.packageName, aVar.f156414d, 3);
                            }
                        }
                        if (aVar.f156412b != null) {
                            aVar.f156412b.get().startActivityForResult(intent, 24);
                        } else {
                            aVar.f156411a.get().startActivityForResult(intent, 24);
                        }
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        Context b2 = com.ss.android.ugc.aweme.i18n.language.i18n.c.b(context);
        com.google.android.play.core.d.a.a(b2, false);
        super.attachBaseContext(b2);
    }

    @Override // com.zhihu.matisse.internal.b.a.AbstractC4129a
    public final void a(final Cursor cursor) {
        this.f156531f.swapCursor(cursor);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.zhihu.matisse.ui.MatisseActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103929);
            }

            public final void run() {
                try {
                    if (!cursor.isClosed()) {
                        cursor.moveToPosition(MatisseActivity.this.f156526a.f156403d);
                        com.zhihu.matisse.internal.ui.widget.a aVar = MatisseActivity.this.f156527b;
                        MatisseActivity matisseActivity = MatisseActivity.this;
                        int i2 = matisseActivity.f156526a.f156403d;
                        aVar.f156518c.c(i2);
                        aVar.a(matisseActivity, i2);
                        Album a2 = Album.a(cursor);
                        if (a2.b() && c.a.f156445a.f156442k) {
                            a2.a();
                        }
                        MatisseActivity.this.a(a2);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f156529d.b(bundle);
        bundle.putInt("state_current_selection", this.f156526a.f156403d);
        bundle.putBoolean("checkState", this.f156538m);
    }

    public final void a(Album album) {
        if (!album.b() || !album.c()) {
            this.f156534i.setVisibility(0);
            this.f156535j.setVisibility(8);
            getSupportFragmentManager().a().b(R.id.ad7, b.a(album), b.class.getSimpleName()).c();
            return;
        }
        this.f156534i.setVisibility(8);
        this.f156535j.setVisibility(0);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.a18) {
            Intent intent = new Intent(this, SelectedPreviewActivity.class);
            intent.putExtra("extra_default_bundle", this.f156529d.a());
            intent.putExtra("extra_result_original_enable", this.f156538m);
            startActivityForResult(intent, 23);
        } else if (view.getId() == R.id.a0x) {
            Intent intent2 = new Intent();
            intent2.putParcelableArrayListExtra("extra_result_selection", (ArrayList) this.f156529d.c());
            intent2.putExtra("extra_result_original_enable", this.f156538m);
            setResult(-1, intent2);
            finish();
        } else if (view.getId() == R.id.d0h) {
            int g2 = g();
            if (g2 > 0) {
                com.zhihu.matisse.internal.ui.widget.b.a("", getString(R.string.d2q, new Object[]{Integer.valueOf(g2), Integer.valueOf(this.f156530e.t)})).show(getSupportFragmentManager(), com.zhihu.matisse.internal.ui.widget.b.class.getName());
                return;
            }
            boolean z = !this.f156538m;
            this.f156538m = z;
            this.f156537l.setChecked(z);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        com.zhihu.matisse.internal.entity.c cVar = c.a.f156445a;
        this.f156530e = cVar;
        setTheme(cVar.f156435d);
        super.onCreate(bundle);
        if (!this.f156530e.p) {
            setResult(0);
            finish();
            return;
        }
        setContentView(R.layout.bk);
        if (this.f156530e.b()) {
            setRequestedOrientation(this.f156530e.f156436e);
        }
        if (this.f156530e.f156442k) {
            this.f156528c = new com.zhihu.matisse.internal.c.a(this);
            if (this.f156530e.f156443l != null) {
                this.f156528c.f156413c = this.f156530e.f156443l;
            } else {
                throw new RuntimeException("Don't forget to set CaptureStrategy.");
            }
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.end);
        setSupportActionBar(toolbar);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        supportActionBar.a();
        supportActionBar.a(true);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.i1});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        navigationIcon.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        this.f156532g = (TextView) findViewById(R.id.a18);
        this.f156533h = (TextView) findViewById(R.id.a0x);
        this.f156532g.setOnClickListener(this);
        this.f156533h.setOnClickListener(this);
        this.f156534i = findViewById(R.id.ad7);
        this.f156535j = findViewById(R.id.awd);
        this.f156536k = (LinearLayout) findViewById(R.id.d0h);
        this.f156537l = (CheckRadioView) findViewById(R.id.d0g);
        this.f156536k.setOnClickListener(this);
        this.f156529d.a(bundle);
        if (bundle != null) {
            this.f156538m = bundle.getBoolean("checkState");
        }
        e();
        this.f156531f = new com.zhihu.matisse.internal.ui.a.b(this);
        com.zhihu.matisse.internal.ui.widget.a aVar = new com.zhihu.matisse.internal.ui.widget.a(this);
        this.f156527b = aVar;
        aVar.f156519d = this;
        com.zhihu.matisse.internal.ui.widget.a aVar2 = this.f156527b;
        aVar2.f156517b = (TextView) findViewById(R.id.dxx);
        Drawable drawable = aVar2.f156517b.getCompoundDrawables()[2];
        TypedArray obtainStyledAttributes2 = aVar2.f156517b.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.i1});
        int color2 = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        drawable.setColorFilter(color2, PorterDuff.Mode.SRC_IN);
        aVar2.f156517b.setVisibility(8);
        aVar2.f156517b.setOnClickListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0134: INVOKE  
              (wrap: android.widget.TextView : 0x012d: IGET  (r1v8 android.widget.TextView) = (r6v0 'aVar2' com.zhihu.matisse.internal.ui.widget.a) com.zhihu.matisse.internal.ui.widget.a.b android.widget.TextView)
              (wrap: com.zhihu.matisse.internal.ui.widget.a$2 : 0x0131: CONSTRUCTOR  (r0v46 com.zhihu.matisse.internal.ui.widget.a$2) = (r6v0 'aVar2' com.zhihu.matisse.internal.ui.widget.a) call: com.zhihu.matisse.internal.ui.widget.a.2.<init>(com.zhihu.matisse.internal.ui.widget.a):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.setOnClickListener(android.view.View$OnClickListener):void in method: com.zhihu.matisse.ui.MatisseActivity.onCreate(android.os.Bundle):void, file: classes10.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0131: CONSTRUCTOR  (r0v46 com.zhihu.matisse.internal.ui.widget.a$2) = (r6v0 'aVar2' com.zhihu.matisse.internal.ui.widget.a) call: com.zhihu.matisse.internal.ui.widget.a.2.<init>(com.zhihu.matisse.internal.ui.widget.a):void type: CONSTRUCTOR in method: com.zhihu.matisse.ui.MatisseActivity.onCreate(android.os.Bundle):void, file: classes10.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 18 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.zhihu.matisse.internal.ui.widget.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.ui.MatisseActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.zhihu.matisse.internal.ui.a.a.d
    public final void a(Album album, Item item, int i2) {
        Intent intent = new Intent(this, AlbumPreviewActivity.class);
        intent.putExtra("extra_album", album);
        intent.putExtra("extra_item", item);
        intent.putExtra("extra_default_bundle", this.f156529d.a());
        intent.putExtra("extra_result_original_enable", this.f156538m);
        startActivityForResult(intent, 23);
    }

    @Override // androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1) {
            if (i2 == 23) {
                Bundle bundleExtra = intent.getBundleExtra("extra_result_bundle");
                Context context = BadParcelableCrashOptimizer.getContext();
                if (!(bundleExtra == null || context == null)) {
                    bundleExtra.setClassLoader(context.getClassLoader());
                }
                ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("state_selection");
                this.f156538m = intent.getBooleanExtra("extra_result_original_enable", false);
                int i4 = bundleExtra.getInt("state_collection_type", 0);
                if (intent.getBooleanExtra("extra_result_apply", false)) {
                    Intent intent2 = new Intent();
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    if (parcelableArrayList != null) {
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Item) it.next()).f156423c);
                        }
                    }
                    intent2.putParcelableArrayListExtra("extra_result_selection", arrayList);
                    intent2.putExtra("extra_result_original_enable", this.f156538m);
                    setResult(-1, intent2);
                } else {
                    com.zhihu.matisse.internal.b.c cVar = this.f156529d;
                    if (parcelableArrayList.size() == 0) {
                        cVar.f156409b = 0;
                    } else {
                        cVar.f156409b = i4;
                    }
                    cVar.f156408a.clear();
                    cVar.f156408a.addAll(parcelableArrayList);
                    Fragment a2 = getSupportFragmentManager().a(b.class.getSimpleName());
                    if (a2 instanceof b) {
                        ((b) a2).f156478a.notifyDataSetChanged();
                    }
                    e();
                    return;
                }
            } else if (i2 == 24) {
                Uri uri = this.f156528c.f156414d;
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                arrayList2.add(uri);
                Intent intent3 = new Intent();
                intent3.putParcelableArrayListExtra("extra_result_selection", arrayList2);
                setResult(-1, intent3);
                if (Build.VERSION.SDK_INT < 21) {
                    revokeUriPermission(uri, 3);
                }
            } else {
                return;
            }
            finish();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f156526a.f156403d = i2;
        this.f156531f.getCursor().moveToPosition(i2);
        Album a2 = Album.a(this.f156531f.getCursor());
        if (a2.b() && c.a.f156445a.f156442k) {
            a2.a();
        }
        a(a2);
    }
}
