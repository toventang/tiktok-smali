package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.livesdk.chatroom.widget.a;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

public final class d extends a {
    public TextView p;

    static {
        Covode.recordClassIndex(9231);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.a
    public final void d() {
        TextView textView = this.p;
        if (textView != null && textView.getVisibility() == 0) {
            this.p.performClick();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.a
    public final void e() {
        super.e();
        TextView textView = this.p;
        if (textView != null) {
            textView.setText(this.n);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.a
    public final View c() {
        return a.a(LayoutInflater.from(getContext()), R.layout.b5z, this, false);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.a
    public final void setText(String str) {
        super.setText(str);
        TextView textView = this.p;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.a
    public final void b(final View view) {
        final ImageView imageView = (ImageView) findViewById(R.id.dpw);
        this.p = (TextView) findViewById(R.id.dpx);
        if (this.f16640g != null && this.f16640g.f18999a != null && this.f16640g.f18999a.getUrls() != null && this.f16640g.f18999a.getUrls().size() != 0) {
            String str = null;
            Iterator<String> it = this.f16640g.f18999a.getUrls().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (!TextUtils.isEmpty(next)) {
                    str = next;
                    break;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                view.setOnClickListener(e.f16655a);
                p.a(imageView, this.f16640g.f18999a, 0, new p.a() {
                    /* class com.bytedance.android.livesdk.chatroom.widget.d.AnonymousClass1 */

                    /* renamed from: d  reason: collision with root package name */
                    private boolean f16654d;

                    static {
                        Covode.recordClassIndex(9232);
                    }

                    @Override // com.bytedance.android.live.core.f.p.a
                    public final void a(ImageModel imageModel) {
                    }

                    @Override // com.bytedance.android.live.core.f.p.a
                    public final void a(ImageModel imageModel, Exception exc) {
                    }

                    @Override // com.bytedance.android.live.core.f.p.a
                    public final void a(ImageModel imageModel, int i2, int i3) {
                        int i4;
                        int i5;
                        String str;
                        float f2;
                        if (!this.f16654d) {
                            this.f16654d = true;
                            int i6 = i2 / 2;
                            int i7 = i3 / 2;
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            layoutParams.width = i2;
                            layoutParams.height = i3;
                            view.setLayoutParams(layoutParams);
                            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                            layoutParams2.width = -1;
                            layoutParams2.height = -1;
                            imageView.setLayoutParams(layoutParams2);
                            if (d.this.f16640g.f19007i == -1 && d.this.f16640g.f19008j == -1) {
                                i4 = ((d.this.f16644k[2] + d.this.f16644k[3]) / 2) - i6;
                                i5 = (d.this.getResources().getDimensionPixelSize(R.dimen.ye) + d.this.f16644k[1]) / 2;
                            } else {
                                float f3 = 1.0f;
                                if (d.this.f16640g.f19009k > 0) {
                                    f2 = ((float) d.this.f16645l) / ((float) d.this.f16640g.f19009k);
                                } else {
                                    f2 = 1.0f;
                                }
                                if (d.this.f16640g.f19010l > 0) {
                                    f3 = ((float) d.this.f16646m) / ((float) d.this.f16640g.f19010l);
                                }
                                i4 = ((int) (((float) d.this.f16640g.f19007i) * f2)) - i6;
                                i5 = (int) (((float) d.this.f16640g.f19008j) * f3);
                            }
                            int i8 = i5 - i7;
                            if (i4 < d.this.f16644k[2]) {
                                i4 = d.this.f16644k[2];
                            } else if (layoutParams.width + i4 > d.this.f16644k[3]) {
                                i4 = d.this.f16644k[3] - layoutParams.width;
                            }
                            if (i8 < d.this.f16644k[0]) {
                                i8 = d.this.f16644k[0];
                            } else if (layoutParams.height + i8 > d.this.f16644k[1]) {
                                i8 = d.this.f16644k[1] - layoutParams.height;
                            }
                            view.setX((float) i4);
                            view.setY((float) i8);
                            d.this.f16640g.f19007i = i4 + i6;
                            d.this.f16640g.f19008j = i8 + i7;
                            if (d.this.f16641h && d.this.f16642i != null) {
                                d.this.f16642i.d();
                            }
                            if (1 == d.this.f16640g.f19005g) {
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) d.this.p.getLayoutParams();
                                if (d.this.f16640g.f19004f != null && d.this.f16640g.f19004f.length == 4) {
                                    layoutParams3.leftMargin = (int) n.b(d.this.getContext(), ((float) d.this.f16640g.f19004f[0]) / 2.0f);
                                    layoutParams3.topMargin = (int) n.b(d.this.getContext(), ((float) d.this.f16640g.f19004f[1]) / 2.0f);
                                    layoutParams3.width = (int) n.b(d.this.getContext(), ((float) d.this.f16640g.f19004f[2]) / 2.0f);
                                    layoutParams3.height = (int) n.b(d.this.getContext(), ((float) d.this.f16640g.f19004f[3]) / 2.0f);
                                }
                                d.this.p.setLayoutParams(layoutParams3);
                                d.this.p.setTextSize(2, (float) (d.this.f16640g.f19001c / 2));
                                d.this.p.setTextColor(Color.parseColor(d.this.f16640g.f19000b));
                                if (!TextUtils.isEmpty(d.this.n)) {
                                    str = d.this.n;
                                } else if (!TextUtils.isEmpty(d.this.f16640g.f19002d)) {
                                    str = d.this.f16640g.f19002d;
                                } else {
                                    str = "";
                                }
                                d.this.p.setText(str);
                                d.this.p.setVisibility(0);
                            } else {
                                d.this.p.setVisibility(8);
                            }
                            d.this.setVisibility(0);
                        }
                    }
                });
            }
        }
    }

    public d(Context context, av avVar, boolean z, int[] iArr, a.AbstractC0333a aVar, boolean z2) {
        super(context, avVar, z, iArr, aVar, z2);
    }
}
