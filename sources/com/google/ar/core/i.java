package com.google.ar.core;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* access modifiers changed from: package-private */
public final class i {
    static {
        Covode.recordClassIndex(33104);
    }

    static PendingIntent a(Context context) {
        RuntimeException runtimeException;
        MethodCollector.i(14207);
        Bundle call = context.getContentResolver().call(new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path("").build(), "getSetupIntent", context.getPackageName(), (Bundle) null);
        if (call == null) {
            MethodCollector.o(14207);
            return null;
        }
        try {
            PendingIntent pendingIntent = (PendingIntent) call.getParcelable("intent");
            if (pendingIntent != null) {
                MethodCollector.o(14207);
                return pendingIntent;
            }
            String string = call.getString("exceptionType", "");
            if (string.isEmpty()) {
                MethodCollector.o(14207);
                return null;
            } else if (string.equals(UnavailableDeviceNotCompatibleException.class.getName())) {
                UnavailableDeviceNotCompatibleException unavailableDeviceNotCompatibleException = new UnavailableDeviceNotCompatibleException();
                MethodCollector.o(14207);
                throw unavailableDeviceNotCompatibleException;
            } else if (!string.equals(UnavailableUserDeclinedInstallationException.class.getName())) {
                Class<? extends U> asSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                String string2 = call.getString("exceptionText", null);
                if (string2 != null) {
                    runtimeException = (RuntimeException) asSubclass.getConstructor(String.class).newInstance(string2);
                } else {
                    runtimeException = (RuntimeException) asSubclass.getConstructor(new Class[0]).newInstance(new Object[0]);
                }
                MethodCollector.o(14207);
                throw runtimeException;
            } else {
                UnavailableUserDeclinedInstallationException unavailableUserDeclinedInstallationException = new UnavailableUserDeclinedInstallationException();
                MethodCollector.o(14207);
                throw unavailableUserDeclinedInstallationException;
            }
        } catch (ReflectiveOperationException | RuntimeException unused) {
            MethodCollector.o(14207);
            return null;
        }
    }
}
