package com.zhihu.matisse.internal.ui;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.d;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhihu.matisse.b.b;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.ui.widget.DraweeViewTouch;
import com.zhiliaoapp.musically.R;
import g.a.a.a.b.a;
import g.a.a.a.b.b;

public final class c extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public b f156484a;

    static {
        Covode.recordClassIndex(103909);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f156484a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.f156484a = (b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Point point;
        super.onViewCreated(view, bundle);
        final Item item = (Item) getArguments().getParcelable("args_item");
        if (item != null) {
            View findViewById = view.findViewById(R.id.fgs);
            if (item.c()) {
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new View.OnClickListener() {
                    /* class com.zhihu.matisse.internal.ui.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(103910);
                    }

                    public final void onClick(View view) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(item.f156423c, "video/*");
                        try {
                            c.this.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            Toast makeText = Toast.makeText(c.this.getContext(), (int) R.string.d2n, 0);
                            if (Build.VERSION.SDK_INT == 25) {
                                ic.a(makeText);
                            }
                            makeText.show();
                        }
                    }
                });
            } else {
                findViewById.setVisibility(8);
            }
            DraweeViewTouch draweeViewTouch = (DraweeViewTouch) view.findViewById(R.id.bmj);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.baq);
            Uri uri = item.f156423c;
            e activity = getActivity();
            ContentResolver contentResolver = activity.getContentResolver();
            Point a2 = com.zhihu.matisse.internal.c.b.a(contentResolver, uri);
            int i2 = a2.x;
            int i3 = a2.y;
            if (com.zhihu.matisse.internal.c.b.a(activity, contentResolver, uri)) {
                i2 = a2.y;
                i3 = a2.x;
            }
            if (i3 == 0) {
                point = new Point(1600, 1600);
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                float f2 = (float) displayMetrics.widthPixels;
                float f3 = (float) i2;
                float f4 = f2 / f3;
                float f5 = (float) i3;
                float f6 = ((float) displayMetrics.heightPixels) / f5;
                if (f4 > f6) {
                    point = new Point((int) (f3 * f4), (int) (f5 * f6));
                } else {
                    point = new Point((int) (f3 * f4), (int) (f5 * f6));
                }
            }
            com.facebook.imagepipeline.o.c a3 = com.facebook.imagepipeline.o.c.a(uri);
            a3.f48447d = new d(point.x, point.y);
            REQUEST request = (REQUEST) a3.a();
            if (item.b()) {
                draweeViewTouch.setVisibility(4);
                simpleDraweeView.setVisibility(0);
                simpleDraweeView.setOnClickListener(new View.OnClickListener() {
                    /* class com.zhihu.matisse.internal.ui.c.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(103911);
                    }

                    public final void onClick(View view) {
                        if (c.this.f156484a != null) {
                            c.this.f156484a.b();
                        }
                    }
                });
                com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
                b2.f47325m = simpleDraweeView.getController();
                b2.f47315c = request;
                b2.f47322j = true;
                simpleDraweeView.setController(b2.e());
                return;
            }
            draweeViewTouch.setVisibility(0);
            simpleDraweeView.setVisibility(4);
            draweeViewTouch.setDisplayType(b.a.FIT_TO_SCREEN);
            draweeViewTouch.setSingleTapListener(new a.c() {
                /* class com.zhihu.matisse.internal.ui.c.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(103912);
                }

                @Override // g.a.a.a.b.a.c
                public final void a() {
                    if (c.this.f156484a != null) {
                        c.this.f156484a.b();
                    }
                }
            });
            draweeViewTouch.setImageRequest(request);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.a1e, viewGroup, false);
    }
}
