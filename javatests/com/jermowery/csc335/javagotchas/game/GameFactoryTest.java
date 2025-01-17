package com.jermowery.csc335.javagotchas.game;

import com.jermowery.csc335.javagotchas.proto.nano.DataProto;
import com.jermowery.csc335.javagotchas.proto.nano.DataProto.Data;
import com.jermowery.csc335.javagotchas.proto.nano.DataProto.Question;
import com.jermowery.csc335.javagotchas.proto.nano.GameSettingsProto.GameSettings;
import com.jermowery.csc335.javagotchas.view.BuildConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static com.google.common.truth.Truth.assertThat;

/**
 * @author jermowery@email.arizona.edu (Jeremy Mowery)
 *
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(sdk = 21, constants = BuildConfig.class)
public class GameFactoryTest {

    @Test
    public void testGetGameNotNull() {
        Data data = new Data();
        data.question = new DataProto.Question[1];
        data.question[0] = new Question();
        assertThat(GameFactory.getGame(new GameSettings(), data)).isNotNull();
    }
}
