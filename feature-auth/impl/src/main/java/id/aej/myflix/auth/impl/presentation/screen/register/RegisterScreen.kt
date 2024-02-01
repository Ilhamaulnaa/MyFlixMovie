package id.aej.myflix.auth.impl.presentation.screen.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import id.aej.myflix.auth.impl.R
import id.aej.myflix.design_system.domain.model.InputWrapper
import id.aej.myflix.design_system.domain.model.PartialClickableTextItems
import id.aej.myflix.design_system.domain.model.PartialClickableTextType
import id.aej.myflix.design_system.presentation.components.FlixButton
import id.aej.myflix.design_system.presentation.components.FlixIconButton
import id.aej.myflix.design_system.presentation.components.FlixPartialClickableText
import id.aej.myflix.design_system.presentation.components.FlixTextField
import id.aej.myflix.design_system.presentation.theme.Gray
import id.aej.myflix.design_system.presentation.theme.Gray15

/**
 * Created by dinopriyano on 27/11/23.
 */

@Composable fun RegisterScreen(
  onToLoginScreen: () -> Unit
) {

  var nameInput by remember {
    mutableStateOf(InputWrapper(""))
  }
  var emailInput by remember {
    mutableStateOf(InputWrapper(""))
  }
  var passwordInput by remember {
    mutableStateOf(InputWrapper(""))
  }
  var confirmPassword by remember {
    mutableStateOf(InputWrapper(""))
  }
  var isShowPassword by remember {
    mutableStateOf((false))
  }


  Column(
    modifier = Modifier
      .fillMaxSize()
  ) {
    Icon(
      modifier = Modifier.padding(start = 24.dp, top = 40.dp),
      painter = painterResource(id = id.aej.myflix.design_system.R.drawable.ic_myflix),
      contentDescription = null,
      tint = Color.Unspecified
    )

    FlixTextField(
      modifier = Modifier
        .padding(top = 24.dp)
        .padding(horizontal = 24.dp)
        .fillMaxWidth(),
      input = nameInput,
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
      visualTransformation = VisualTransformation.None,
      label = R.string.name_txt,
      placeholder = R.string.name_placholder,
      onValueChange = {
        nameInput = nameInput.copy(it)
      }
    )

    FlixTextField(
      modifier = Modifier
        .padding(top = 20.dp)
        .padding(horizontal = 24.dp)
        .fillMaxWidth(),
      input = emailInput,
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
      visualTransformation = VisualTransformation.None,
      label = R.string.email_address_txt,
      placeholder = R.string.email_address_placeholder,
      onValueChange = {
        emailInput = emailInput.copy(it)
      }
    )
    FlixTextField(
      modifier = Modifier
        .padding(top = 20.dp)
        .padding(horizontal = 24.dp)
        .fillMaxWidth(),
      input = passwordInput,
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
      visualTransformation = if (isShowPassword) VisualTransformation.None else PasswordVisualTransformation(),
      trailingIcon = {
        IconButton(
          onClick = {
            isShowPassword = !isShowPassword
          }
        ) {
          Icon(
            imageVector = if (isShowPassword) Icons.Filled.VisibilityOff else Icons.Filled.Visibility,
            contentDescription = null,
            tint = Gray
          )
        }
      },
      label = R.string.password_txt,
      placeholder = R.string.password_placeholder,
      onValueChange = {
        passwordInput = passwordInput.copy(it)
      }
    )
    FlixTextField(
      modifier = Modifier
        .padding(top = 20.dp)
        .padding(horizontal = 24.dp)
        .fillMaxWidth(),
      input = confirmPassword,
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
      visualTransformation = if (isShowPassword) VisualTransformation.None else PasswordVisualTransformation(),
      trailingIcon = {
        IconButton(
          onClick = {
            isShowPassword = !isShowPassword
          }) {
          Icon(
            imageVector = if (isShowPassword) Icons.Filled.VisibilityOff else Icons.Filled.Visibility,
            contentDescription = null,
            tint = Gray
          )
        }
      },
      label = R.string.confirm_password_txt,
      placeholder = R.string.confirm_password_placeholder,
      onValueChange = {
        confirmPassword = confirmPassword.copy(it)
      }
    )
    
    FlixButton(
      modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 24.dp)
        .padding(top = 36.dp),
      buttonText = R.string.sign_up_txt,
    ) {
      // TODO: On sign in button click
    }

    Text(
      modifier = Modifier
        .padding(top = 24.dp)
        .align(Alignment.CenterHorizontally),
      text = stringResource(id =R.string.or_txt ),
      style = MaterialTheme.typography.labelMedium,
      color = Gray
    )

    Row(
      modifier = Modifier
        .align(Alignment.CenterHorizontally)
        .padding(top = 24.dp)
    ) {

      FlixIconButton(
        modifier = Modifier,
        icon = id.aej.myflix.design_system.R.drawable.ic_google,
        contentColor = Gray,
        buttonColor = Gray15
      ) {
      }
      FlixIconButton(
        modifier = Modifier,
        icon = id.aej.myflix.design_system.R.drawable.ic_facebook,
        contentColor = Gray,
        buttonColor = Gray15
      ) {
      }
      FlixIconButton(
        modifier = Modifier,
        icon = id.aej.myflix.design_system.R.drawable.ic_twitter,
        contentColor = Gray,
        buttonColor = Gray15
      ) {
      }

    }
    FlixPartialClickableText(
      modifier = Modifier
        .align(CenterHorizontally)
        .padding(top = 24.dp, bottom = 32.dp),
      textStyle = MaterialTheme.typography.bodyLarge,
      items = listOf(
        PartialClickableTextItems(
          text = stringResource(id = R.string.have_an_account_txt),
          color = Gray,
          type = PartialClickableTextType.NORMAL
        ),
        PartialClickableTextItems(
          text = stringResource(id = R.string.sign_in_txt),
          color = Color.Red,
          type = PartialClickableTextType.CLICKABLE,
          onClick = {
            onToLoginScreen.invoke()
          }
        )
      )
    )
  }
}