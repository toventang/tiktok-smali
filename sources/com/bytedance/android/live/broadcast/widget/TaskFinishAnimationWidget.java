package com.bytedance.android.live.broadcast.widget;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.f.a;
import com.bytedance.android.livesdk.gift.assets.d;
import com.bytedance.android.livesdk.livebuild.b;
import com.bytedance.android.livesdk.livebuild.c;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.b.a;
import f.a.d.f;
import java.util.HashMap;
import java.util.concurrent.Callable;

public class TaskFinishAnimationWidget extends LiveRecyclableWidget implements WeakHandler.IHandler, au {

    /* renamed from: a  reason: collision with root package name */
    public TextView f8727a;

    /* renamed from: b  reason: collision with root package name */
    public AlphaAnimation f8728b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f8729c;

    /* renamed from: d  reason: collision with root package name */
    public AlphaAnimation f8730d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakHandler f8731e = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: f  reason: collision with root package name */
    private LottieAnimationView f8732f;

    /* renamed from: g  reason: collision with root package name */
    private a f8733g = new a();

    static {
        Covode.recordClassIndex(4467);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.b59;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        a aVar = this.f8733g;
        if (aVar != null) {
            aVar.a();
        }
        AlphaAnimation alphaAnimation = this.f8730d;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
            this.f8730d = null;
        }
        AlphaAnimation alphaAnimation2 = this.f8728b;
        if (alphaAnimation2 != null) {
            alphaAnimation2.cancel();
            this.f8728b = null;
        }
        if (this.f8729c != null) {
            this.f8729c = null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        this.f8727a = (TextView) findViewById(R.id.erk);
        this.f8732f = (LottieAnimationView) findViewById(R.id.erj);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        this.f8733g.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.live.broadcast.api.model.a.class).d(new f<com.bytedance.android.live.broadcast.api.model.a>() {
            /* class com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4468);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(com.bytedance.android.live.broadcast.api.model.a aVar) {
                com.bytedance.android.live.broadcast.api.model.a aVar2 = aVar;
                TaskFinishAnimationWidget taskFinishAnimationWidget = TaskFinishAnimationWidget.this;
                if (aVar2 != null && !TextUtils.isEmpty(aVar2.f7542b)) {
                    SpannableString spannableString = new SpannableString(aVar2.f7541a + "\n" + aVar2.f7542b);
                    if (!TextUtils.isEmpty(aVar2.f7541a)) {
                        spannableString.setSpan(new AbsoluteSizeSpan(y.a(11.0f)), 0, aVar2.f7541a.length(), 18);
                    }
                    taskFinishAnimationWidget.f8727a.setText(spannableString);
                    ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).getAssetsManager().a((long) LiveBroadcastTaskResourceIdSetting.INSTANCE.getValue(), new d() {
                        /* class com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(4470);
                        }

                        @Override // com.bytedance.android.livesdk.gift.assets.d, com.bytedance.android.livesdk.gift.assets.a
                        public final void a(Throwable th) {
                            com.bytedance.android.live.core.c.a.b("TaskFinishAnimationWidget", th.toString(), th);
                        }

                        @Override // com.bytedance.android.livesdk.gift.assets.d, com.bytedance.android.livesdk.gift.assets.a
                        public final void a(String str) {
                            com.bytedance.ies.e.a.a.a().a(TaskFinishAnimationWidget.this.f8731e, new Callable(str) {
                                /* class com.bytedance.android.livesdk.utils.af.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ String f22228a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ int f22229b = 7;

                                static {
                                    Covode.recordClassIndex(13124);
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return af.a(this.f22228a, this.f22229b);
                                }

                                {
                                    this.f22228a = r2;
                                }
                            }, 100);
                        }
                    }, 4);
                }
            }
        }));
        this.f8732f.a(new Animator.AnimatorListener() {
            /* class com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.AnonymousClass2 */

            static {
                Covode.recordClassIndex(4469);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                n.a(TaskFinishAnimationWidget.this.f8727a, 8);
            }

            public final void onAnimationStart(Animator animator) {
                n.a(TaskFinishAnimationWidget.this.f8727a, 0);
                TaskFinishAnimationWidget taskFinishAnimationWidget = TaskFinishAnimationWidget.this;
                taskFinishAnimationWidget.f8730d = new AlphaAnimation(0.0f, 1.0f);
                taskFinishAnimationWidget.f8728b = new AlphaAnimation(1.0f, 0.0f);
                taskFinishAnimationWidget.f8730d.setDuration(200);
                taskFinishAnimationWidget.f8728b.setDuration(200);
                taskFinishAnimationWidget.f8729c = new Runnable() {
                    /* class com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(4471);
                    }

                    public final void run() {
                        if (TaskFinishAnimationWidget.this.isViewValid()) {
                            TaskFinishAnimationWidget.this.f8727a.startAnimation(TaskFinishAnimationWidget.this.f8728b);
                        }
                    }
                };
                TaskFinishAnimationWidget.this.f8727a.startAnimation(TaskFinishAnimationWidget.this.f8730d);
                TaskFinishAnimationWidget.this.f8727a.postDelayed(TaskFinishAnimationWidget.this.f8729c, 1700);
            }
        });
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        b<?> bVar;
        if (message != null && message.what == 100 && (message.obj instanceof com.bytedance.android.livesdk.aa.a)) {
            com.bytedance.android.livesdk.aa.a aVar = (com.bytedance.android.livesdk.aa.a) message.obj;
            LottieAnimationView lottieAnimationView = this.f8732f;
            Object obj = null;
            if (aVar != null && aVar.f13387b != null && aVar.f13388c != null && lottieAnimationView != null) {
                n.a(lottieAnimationView, 0);
                lottieAnimationView.d();
                lottieAnimationView.setProgress(0.0f);
                HashMap<String, Bitmap> hashMap = aVar.f13390e;
                if (hashMap != null) {
                    lottieAnimationView.setImageAssetDelegate(new a.C0360a(hashMap));
                }
                e eVar = com.bytedance.android.livesdk.f.a.f17211a.get(aVar.f13387b);
                if (eVar == null) {
                    try {
                        if (!(com.bytedance.android.livesdk.livebuild.a.f18688a == null || !com.bytedance.android.livesdk.livebuild.a.f18688a.containsKey(c.class) || (bVar = com.bytedance.android.livesdk.livebuild.a.f18688a.get(c.class)) == null)) {
                            obj = bVar.a();
                        }
                        ((c) obj).fromJson(lottieAnimationView.getContext(), aVar.f13389d, new a.b(aVar, lottieAnimationView));
                    } catch (Exception unused) {
                    }
                } else {
                    lottieAnimationView.setComposition(eVar);
                    lottieAnimationView.a();
                }
            }
        }
    }
}
