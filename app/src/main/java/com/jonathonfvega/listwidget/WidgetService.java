package com.jonathonfvega.listwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by jonathonfvega on 1/15/17.
 */

public class WidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new WidgetAdapter(this);
    }
}
