/*
 * Copyright (c) UChicago Argonne, LLC. All rights reserved.
 * See LICENSE file.
 */
package gov.anl.aps.cdb.portal.import_export.import_.objects.specs;

import gov.anl.aps.cdb.portal.controllers.CdbEntityController;
import gov.anl.aps.cdb.portal.import_export.import_.objects.ColumnModeOptions;
import gov.anl.aps.cdb.portal.import_export.import_.objects.handlers.RefInputHandler;
import gov.anl.aps.cdb.portal.import_export.import_.objects.handlers.InputHandler;
import java.util.List;

/**
 *
 * @author craig
 */
public class IdOrNameRefListColumnSpec extends IdOrNameRefColumnSpec {

    public IdOrNameRefListColumnSpec(
            String header, 
            String importPropertyName, 
            String importSetterMethod, 
            String description,
            String exportGetterMethod,
            String exportTransferGetterMethod,
            List<ColumnModeOptions> options, 
            CdbEntityController controller, 
            Class paramType, 
            String domainNameFilter) {
        
        super(header, 
                importPropertyName, 
                importSetterMethod, 
                description, 
                exportGetterMethod, 
                exportTransferGetterMethod, 
                options,
                controller, 
                paramType,
                domainNameFilter);
    }

    @Override
    public InputHandler getInputHandler(int colIndex) {
        return new RefInputHandler(
                colIndex,
                getHeader(),
                getPropertyName(),
                getEntitySetterMethod(),
                controller,
                paramType,
                domainNameFilter,
                false,
                false);
    }

}
