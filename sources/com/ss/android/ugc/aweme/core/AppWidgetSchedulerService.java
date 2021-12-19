package com.ss.android.ugc.aweme.core;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class AppWidgetSchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    private a f78230a;

    static {
        Covode.recordClassIndex(48511);
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final AppWidgetSchedulerService f78231a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f78232b;

        static {
            Covode.recordClassIndex(48512);
        }

        /* renamed from: com.ss.android.ugc.aweme.core.AppWidgetSchedulerService$a$a  reason: collision with other inner class name */
        static final class C1816a extends m implements h.f.a.a<z> {
            final /* synthetic */ JobParameters $jobParameters;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(48513);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1816a(a aVar, JobParameters jobParameters) {
                super(0);
                this.this$0 = aVar;
                this.$jobParameters = jobParameters;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f78231a.jobFinished(this.$jobParameters, false);
                return z.f158842a;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
            if (r2 == null) goto L_0x00a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c5, code lost:
            if (r2 != null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
            if (r2 != null) goto L_0x0060;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r20) {
            /*
            // Method dump skipped, instructions count: 216
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.core.AppWidgetSchedulerService.a.handleMessage(android.os.Message):void");
        }

        public a(Context context, AppWidgetSchedulerService appWidgetSchedulerService) {
            l.d(context, "");
            l.d(appWidgetSchedulerService, "");
            this.f78232b = context;
            this.f78231a = appWidgetSchedulerService;
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        int i2;
        PersistableBundle extras;
        if (this.f78230a == null) {
            Context applicationContext = getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            l.b(applicationContext, "");
            this.f78230a = new a(applicationContext, this);
        }
        Message message = new Message();
        if (jobParameters == null || (extras = jobParameters.getExtras()) == null) {
            i2 = -1;
        } else {
            i2 = extras.getInt("app_widget_action_type");
        }
        message.what = i2;
        message.obj = jobParameters;
        a aVar = this.f78230a;
        if (aVar == null) {
            return true;
        }
        aVar.sendMessage(message);
        return true;
    }
}
