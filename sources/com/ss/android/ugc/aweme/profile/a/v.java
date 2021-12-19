package com.ss.android.ugc.aweme.profile.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.g;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.p;
import java.util.List;

public final class v extends RecyclerView.ViewHolder {

    /* renamed from: f  reason: collision with root package name */
    public static final a f115938f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Aweme f115939a;

    /* renamed from: b  reason: collision with root package name */
    public long f115940b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final View f115941c;

    /* renamed from: d  reason: collision with root package name */
    public final String f115942d;

    /* renamed from: e  reason: collision with root package name */
    public final b f115943e;

    static {
        Covode.recordClassIndex(74771);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(74774);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static int a(List<? extends Aweme> list) {
            if (list != null) {
                int i2 = 0;
                for (Aweme aweme : list) {
                    if (aweme.getAwemeType() == 40) {
                        return i2;
                    }
                    i2++;
                }
            }
            return -1;
        }

        public static boolean a(int i2, User user) {
            boolean z;
            boolean z2;
            String str;
            boolean z3;
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.ugc.aweme.story.avatar.c d2 = g.f137757a.d();
            if (d2 != null) {
                z2 = d2.a(user);
            } else {
                z2 = false;
            }
            com.ss.android.ugc.aweme.story.api.b e2 = g.f137757a.e();
            if (user == null || (str = user.getUid()) == null) {
                str = "";
            }
            if (e2.a(str) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!com.ss.android.ugc.aweme.story.c.b.f() || !z || (!z2 && !z3)) {
                return false;
            }
            return true;
        }

        public static boolean a(Aweme aweme, Aweme aweme2) {
            l.d(aweme, "");
            l.d(aweme2, "");
            UserStory userStory = aweme.getUserStory();
            if (userStory != null) {
                long addToCacheTime = userStory.getAddToCacheTime();
                UserStory userStory2 = aweme2.getUserStory();
                if (userStory2 == null || userStory2.getAddToCacheTime() < addToCacheTime) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f115947a = new c();

        static {
            Covode.recordClassIndex(74776);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) obj);
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f115946a;

        static {
            Covode.recordClassIndex(74775);
        }

        b(v vVar) {
            this.f115946a = vVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f115946a.f115940b = ((com.ss.android.ugc.aweme.story.model.g) obj).getPlayVideoViewers();
            TuxTextView tuxTextView = (TuxTextView) this.f115946a.f115941c.findViewById(R.id.f4l);
            l.b(tuxTextView, "");
            tuxTextView.setText(com.ss.android.ugc.aweme.i18n.b.a(this.f115946a.f115940b));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(View view, String str, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        this.f115941c = view;
        this.f115942d = str;
        this.f115943e = bVar;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.profile.a.v.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f115944a;

            static {
                Covode.recordClassIndex(74772);
            }

            {
                this.f115944a = r1;
            }

            public final void onClick(View view) {
                User author;
                com.ss.android.ugc.aweme.story.avatar.c d2;
                String str;
                String str2;
                ClickAgent.onClick(view);
                d dVar = this.f115944a.f115943e.f115804g;
                if (dVar != null) {
                    dVar.a(this.f115944a.f115941c, this.f115944a.f115939a, this.f115944a.f115942d);
                }
                Aweme aweme = this.f115944a.f115939a;
                if (aweme != null && (author = aweme.getAuthor()) != null && (d2 = g.f137757a.d()) != null) {
                    User c2 = in.c();
                    l.b(c2, "");
                    if (l.a((Object) c2.getUid(), (Object) author.getUid())) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    Aweme aweme2 = this.f115944a.f115939a;
                    if (aweme2 != null) {
                        str2 = aweme2.getRequestId();
                    } else {
                        str2 = null;
                    }
                    d2.a("story_click", str, author, str2, new p[0]);
                }
            }
        });
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.profile.a.v.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f115945a;

            static {
                Covode.recordClassIndex(74773);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f115945a = r1;
            }

            public final void onViewDetachedFromWindow(View view) {
                ((SmartImageView) this.f115945a.f115941c.findViewById(R.id.bvt)).setAttached(false);
            }

            public final void onViewAttachedToWindow(View view) {
                User author;
                com.ss.android.ugc.aweme.story.avatar.c d2;
                String str;
                String str2;
                ((SmartImageView) this.f115945a.f115941c.findViewById(R.id.bvt)).setAttached(true);
                Aweme aweme = this.f115945a.f115939a;
                if (aweme != null && (author = aweme.getAuthor()) != null && (d2 = g.f137757a.d()) != null) {
                    User c2 = in.c();
                    l.b(c2, "");
                    if (l.a((Object) c2.getUid(), (Object) author.getUid())) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    Aweme aweme2 = this.f115945a.f115939a;
                    if (aweme2 != null) {
                        str2 = aweme2.getRequestId();
                    } else {
                        str2 = null;
                    }
                    d2.a("story_show", str, author, str2, new p[0]);
                }
            }
        });
    }
}
