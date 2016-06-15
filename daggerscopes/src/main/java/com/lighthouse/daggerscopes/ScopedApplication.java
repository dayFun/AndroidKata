package com.lighthouse.daggerscopes;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

public class ScopedApplication extends Application {

    private KingComponent kingComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        if(kingComponent == null) {
            kingComponent = DaggerKingComponent.builder()
                                               .kingModule(new KingModule())
                                               .build();
        }
    }

    @NonNull
    public static ScopedApplication getApplication(@NonNull Context context) {
        return (ScopedApplication) context.getApplicationContext();
    }

    public KingComponent getKingComponent() {
        return kingComponent;
    }
}
