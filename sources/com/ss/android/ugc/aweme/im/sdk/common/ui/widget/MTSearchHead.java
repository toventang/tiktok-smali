package com.ss.android.ugc.aweme.im.sdk.common.ui.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sdk.common.controller.b.b;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.List;

public final class MTSearchHead extends LinearLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final a f102555e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final EditText f102556a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f102557b;

    /* renamed from: c  reason: collision with root package name */
    public ShareDialogViewModel f102558c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.a<z> f102559d;

    /* renamed from: f  reason: collision with root package name */
    private final View f102560f;

    static {
        Covode.recordClassIndex(65676);
    }

    public MTSearchHead(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65682);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f102556a.clearFocus();
        KeyboardUtils.c(this.f102556a);
    }

    public final void setEditClickCallBack(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f102559d = aVar;
    }

    public final void setListViewModel(ShareDialogViewModel shareDialogViewModel) {
        l.d(shareDialogViewModel, "");
        this.f102558c = shareDialogViewModel;
    }

    private /* synthetic */ MTSearchHead(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MTSearchHead(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(6088);
        View inflate = View.inflate(context, R.layout.a83, this);
        l.b(inflate, "");
        this.f102560f = inflate;
        View findViewById = inflate.findViewById(R.id.dur);
        l.b(findViewById, "");
        EditText editText = (EditText) findViewById;
        this.f102556a = editText;
        View findViewById2 = inflate.findViewById(R.id.y0);
        l.b(findViewById2, "");
        ImageView imageView = (ImageView) findViewById2;
        this.f102557b = imageView;
        editText.setOnKeyListener(new View.OnKeyListener(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.MTSearchHead.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MTSearchHead f102561a;

            static {
                Covode.recordClassIndex(65677);
            }

            {
                this.f102561a = r1;
            }

            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                ShareDialogViewModel shareDialogViewModel;
                List<? extends IMContact> list;
                String c2;
                if (i2 == 66) {
                    this.f102561a.a();
                    return true;
                } else if (i2 != 67) {
                    return false;
                } else {
                    l.b(keyEvent, "");
                    if (keyEvent.getAction() != 1 || ((shareDialogViewModel = this.f102561a.f102558c) != null && (c2 = shareDialogViewModel.c()) != null && c2.length() != 0)) {
                        return false;
                    }
                    ShareDialogViewModel shareDialogViewModel2 = this.f102561a.f102558c;
                    if (shareDialogViewModel2 != null) {
                        List<IMContact> value = shareDialogViewModel2.f103762d.getValue();
                        if (value == null || (list = n.c((List) value, 1)) == null) {
                            list = h.a.z.INSTANCE;
                        }
                        shareDialogViewModel2.b(list);
                    }
                    return true;
                }
            }
        });
        editText.setOnTouchListener(new View.OnTouchListener(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.MTSearchHead.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MTSearchHead f102562a;

            static {
                Covode.recordClassIndex(65678);
            }

            {
                this.f102562a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l.b(motionEvent, "");
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                b.b("share");
                this.f102562a.f102556a.requestFocus();
                KeyboardUtils.b(this.f102562a.f102556a);
                return false;
            }
        });
        editText.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.MTSearchHead.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MTSearchHead f102563a;

            static {
                Covode.recordClassIndex(65679);
            }

            {
                this.f102563a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                h.f.a.a<z> aVar = this.f102563a.f102559d;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
        editText.addTextChangedListener(new TextWatcher(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.MTSearchHead.AnonymousClass4 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MTSearchHead f102564a;

            static {
                Covode.recordClassIndex(65680);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                l.d(charSequence, "");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f102564a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                String str;
                if (editable != null) {
                    str = editable.toString();
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    ShareDialogViewModel shareDialogViewModel = this.f102564a.f102558c;
                    if (shareDialogViewModel != null) {
                        shareDialogViewModel.a(0);
                    }
                    ShareDialogViewModel shareDialogViewModel2 = this.f102564a.f102558c;
                    if (shareDialogViewModel2 != null) {
                        shareDialogViewModel2.d();
                        return;
                    }
                    return;
                }
                ShareDialogViewModel shareDialogViewModel3 = this.f102564a.f102558c;
                if (shareDialogViewModel3 != null) {
                    shareDialogViewModel3.a(1);
                }
                ShareDialogViewModel shareDialogViewModel4 = this.f102564a.f102558c;
                if (shareDialogViewModel4 != null) {
                    l.d(str, "");
                    shareDialogViewModel4.f103767i.a(str);
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                l.d(charSequence, "");
                if (!TextUtils.isEmpty(charSequence) && this.f102564a.f102557b.getVisibility() == 8) {
                    this.f102564a.f102557b.setVisibility(0);
                } else if (TextUtils.isEmpty(charSequence) && this.f102564a.f102557b.getVisibility() == 0) {
                    this.f102564a.f102557b.setVisibility(8);
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.MTSearchHead.AnonymousClass5 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MTSearchHead f102565a;

            static {
                Covode.recordClassIndex(65681);
            }

            {
                this.f102565a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f102565a.f102556a.setText("");
            }
        });
        MethodCollector.o(6088);
    }
}
