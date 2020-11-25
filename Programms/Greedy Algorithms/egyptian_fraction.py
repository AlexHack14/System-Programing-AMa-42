
res_arr = []


def show_res():
    for el in res_arr:
        if el == res_arr[-1]:
            print(f'1/{el}')
        else:
            print(f'1/{el} + ', end='')

def egyptian_fraction(fraction):

    assert fraction < 1

    if int(fraction*1000000) == 0:
        return

    n_den = 1
    while int(fraction*1000000) < int(1/n_den*1000000):
        n_den += 1

    res_arr.append(n_den)
    new_frac = fraction - 1/n_den

    egyptian_fraction(new_frac)


num = 5
den = 6
fr = num/den
egyptian_fraction(fr)

print(f"{num}/{den} Egyptian Fraction is:")
show_res()