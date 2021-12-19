package androidx.appcompat.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.d.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.WeakHashMap;

/* access modifiers changed from: package-private */
public final class ag extends c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public int f1523a = 1;

    /* renamed from: m  reason: collision with root package name */
    private final SearchManager f1524m = ((SearchManager) a(this.f2671e, "search"));
    private final SearchView n;
    private final SearchableInfo o;
    private final Context p;
    private final WeakHashMap<String, Drawable.ConstantState> q;
    private final int r;
    private boolean s = false;
    private ColorStateList t;
    private int u = -1;
    private int v = -1;
    private int w = -1;
    private int x = -1;
    private int y = -1;
    private int z = -1;

    static {
        Covode.recordClassIndex(464);
    }

    @Override // androidx.d.a.a
    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074 A[Catch:{ RuntimeException -> 0x0016 }] */
    @Override // androidx.d.a.b.a, androidx.d.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor a(java.lang.CharSequence r13) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ag.a(java.lang.CharSequence):android.database.Cursor");
    }

    @Override // androidx.d.a.b.a, androidx.d.a.a
    public final void a(Cursor cursor) {
        if (!this.s) {
            try {
                super.a(cursor);
                if (cursor != null) {
                    this.u = cursor.getColumnIndex("suggest_text_1");
                    this.v = cursor.getColumnIndex("suggest_text_2");
                    this.w = cursor.getColumnIndex("suggest_text_2_url");
                    this.x = cursor.getColumnIndex("suggest_icon_1");
                    this.y = cursor.getColumnIndex("suggest_icon_2");
                    this.z = cursor.getColumnIndex("suggest_flags");
                }
            } catch (Exception unused) {
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @Override // androidx.d.a.c, androidx.d.a.a
    public final View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a2 = super.a(context, cursor, viewGroup);
        a2.setTag(new a(a2));
        ((ImageView) a2.findViewById(R.id.at5)).setImageResource(this.r);
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011e, code lost:
        if (r11 == null) goto L_0x00fc;
     */
    @Override // androidx.d.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r20, android.database.Cursor r21) {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ag.a(android.view.View, android.database.Cursor):void");
    }

    private void a(String str, Drawable drawable) {
        if (drawable != null) {
            this.q.put(str, drawable.getConstantState());
        }
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        c(a());
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        c(a());
    }

    private static void c(Cursor cursor) {
        Bundle extras;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.n.setQuery((CharSequence) tag);
        }
    }

    private Drawable b(String str) {
        Drawable.ConstantState constantState = this.q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1525a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1526b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1527c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1528d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1529e;

        static {
            Covode.recordClassIndex(465);
        }

        public a(View view) {
            this.f1525a = (TextView) view.findViewById(16908308);
            this.f1526b = (TextView) view.findViewById(16908309);
            this.f1527c = (ImageView) view.findViewById(16908295);
            this.f1528d = (ImageView) view.findViewById(16908296);
            this.f1529e = (ImageView) view.findViewById(R.id.at5);
        }
    }

    private Drawable a(ComponentName componentName) {
        PackageManager packageManager = this.f2671e.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // androidx.d.a.b.a, androidx.d.a.a
    public final CharSequence b(Cursor cursor) {
        String a2;
        String a3;
        if (cursor == null) {
            return null;
        }
        String a4 = a(cursor, "suggest_intent_query");
        if (a4 != null) {
            return a4;
        }
        if (this.o.shouldRewriteQueryFromData() && (a3 = a(cursor, "suggest_intent_data")) != null) {
            return a3;
        }
        if (!this.o.shouldRewriteQueryFromText() || (a2 = a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a2;
    }

    private Drawable a(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return b(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: ".concat(String.valueOf(uri)));
                }
            } else {
                InputStream openInputStream = this.p.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    try {
                        return Drawable.createFromStream(openInputStream, null);
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                } else {
                    throw new FileNotFoundException("Failed to open ".concat(String.valueOf(uri)));
                }
            }
        } catch (FileNotFoundException e2) {
            e2.getMessage();
            return null;
        }
    }

    private Drawable a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.p.getPackageName() + "/" + parseInt;
            Drawable b2 = b(str2);
            if (b2 != null) {
                return b2;
            }
            Drawable a2 = b.a(this.p, parseInt);
            a(str2, a2);
            return a2;
        } catch (NumberFormatException unused) {
            Drawable b3 = b(str);
            if (b3 != null) {
                return b3;
            }
            Drawable a3 = a(Uri.parse(str));
            a(str, a3);
            return a3;
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    private Drawable b(Uri uri) {
        int i2;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f2671e.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i2 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(uri)));
                        }
                    } else if (size == 2) {
                        i2 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(uri)));
                    }
                    if (i2 != 0) {
                        return resourcesForApplication.getDrawable(i2);
                    }
                    throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(uri)));
                }
                throw new FileNotFoundException("No path: ".concat(String.valueOf(uri)));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(uri)));
            }
        } else {
            throw new FileNotFoundException("No authority: ".concat(String.valueOf(uri)));
        }
    }

    private static String a(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(Cursor cursor, String str) {
        return a(cursor, cursor.getColumnIndex(str));
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    private static void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // androidx.d.a.a
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            View b2 = b(this.f2671e, this.f2670d, viewGroup);
            if (b2 != null) {
                ((a) b2.getTag()).f1525a.setText(e2.toString());
            }
            return b2;
        }
    }

    @Override // androidx.d.a.a
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            View a2 = a(this.f2671e, this.f2670d, viewGroup);
            if (a2 != null) {
                ((a) a2.getTag()).f1525a.setText(e2.toString());
            }
            return a2;
        }
    }

    private static void a(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public ag(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.n = searchView;
        this.o = searchableInfo;
        this.r = searchView.getSuggestionCommitIconResId();
        this.p = context;
        this.q = weakHashMap;
    }
}
