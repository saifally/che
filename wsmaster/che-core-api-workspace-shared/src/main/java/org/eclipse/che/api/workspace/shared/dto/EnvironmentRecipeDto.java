/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.workspace.shared.dto;

import org.eclipse.che.api.core.model.workspace.EnvironmentRecipe;
import org.eclipse.che.dto.shared.DTO;

/**
 * @author Alexander Garagatyi
 */
@DTO
public interface EnvironmentRecipeDto extends EnvironmentRecipe {
    @Override
    String getType();

    void setType(String type);

    EnvironmentRecipeDto withType(String type);

    @Override
    String getContentType();

    void setContentType(String contentType);

    EnvironmentRecipeDto withContentType(String contentType);

    @Override
    String getContent();

    void setContent(String content);

    EnvironmentRecipeDto withContent(String content);

    @Override
    String getLocation();

    void setLocation(String location);

    EnvironmentRecipeDto withLocation(String location);
}